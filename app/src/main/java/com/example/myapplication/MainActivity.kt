package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    var arrayList: ArrayList<MyData> = ArrayList()
    var adapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        listView = findViewById(R.id.listview)
        arrayList.add(MyData(1, " Mashu", "987576443"))
        arrayList.add(MyData(2, " Azhar", "8787576768"))
        arrayList.add(MyData(3, " Niyaz", "65757657657"))
        adapter = MyAdapter(this, arrayList)
        listView.adapter = adapter
    }
}
//Class MyAdapter
class MyAdapter(private val context: Context, private val arrayList: java.util.ArrayList<MyData>) : BaseAdapter() {
    private lateinit var serialNum: TextView
    private lateinit var name: TextView
    private lateinit var contactNum: TextView
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        serialNum = convertView.findViewById(R.id.number_text)
        name = convertView.findViewById(R.id.title_text)
        contactNum = convertView.findViewById(R.id.phone_text)
        serialNum.text = " " + arrayList[position].num
        name.text = arrayList[position].name
        contactNum.text = arrayList[position].mobileNumber
        return convertView
    }
}
class MyData(var num: Int, var name: String, var mobileNumber: String)