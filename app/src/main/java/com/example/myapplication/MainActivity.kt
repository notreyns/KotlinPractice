package com.example.myapplication

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add(" ${i} element") }
        return data
    }
}