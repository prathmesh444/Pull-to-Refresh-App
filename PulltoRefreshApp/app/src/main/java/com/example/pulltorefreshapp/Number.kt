package com.example.pulltorefreshapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Number(itemView: View): RecyclerView.ViewHolder(itemView) {
    var Num = itemView.findViewById<TextView>(R.id.card_textView)
}