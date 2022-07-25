package com.example.pulltorefreshapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.pulltorefreshapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var list = arrayListOf<Int>()
    var count = 0
    var  mAdapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycleView1.layoutManager = LinearLayoutManager(this)
        setNumber()
        binding.recycleView1.adapter = mAdapter
        binding.refresh.setOnRefreshListener {
            count++
            setNumber()
            binding.recycleView1.adapter = mAdapter
            binding.refresh.isRefreshing = false
        }


    }
    fun setNumber() {
        list.reverse()
        list.add(count)
        list.reverse()
        mAdapter.Update(list)
        var St = ""
        list.forEach {
            St += it.toString()
        }
        Toast.makeText(this,St,Toast.LENGTH_LONG).show()
    }
}