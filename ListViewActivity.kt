package com.example.andriodx

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    lateinit var  listView: ListView ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        listView.setOnItemClickListener { parent, view, position, id ->
            val data = parent.getItemAtPosition(position)
        }
        setContentView(R.layout.activity_list_view)
        listView = findViewById(R.id.listView)

        var data  = resources.getStringArray(R.array.countries)

        var adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,data)

        listView.adapter = adapter ;

    }
}