package com.example.pulltorefreshapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

open class Adapter() : RecyclerView.Adapter<Number>() {

    private var list:ArrayList<Int> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Number {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view,parent,false)
        val N = Number(view)
        return N
    }

    override fun onBindViewHolder(holder: Number, position: Int) {
        val currentItem = list[position]
        holder.Num.text = currentItem.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun Update(newList : ArrayList<Int>){
        list.clear()
        list.addAll(newList)

        notifyDataSetChanged()
    }

}