package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array= arrayOf("Cat", "Dog", "Fish")

        val adapter= ArrayAdapter(this, R.layout.list_item,R.id.title_text, array)
        val listView: ListView = findViewById(R.id.listview)
        listView.adapter= adapter
    }
}