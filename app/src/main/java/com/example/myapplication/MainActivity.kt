package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array= resources.getStringArray(R.array.dayofweek)
        val adapter= ArrayAdapter(this,R.layout.list_item, R.id.title_text, array)
        val listView: ListView = findViewById(R.id.listview)
        listView.adapter= adapter
    }
}