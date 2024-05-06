package com.example.andriodx

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.andriodx.adapter.RecyclerAdapter

class RecycleViewActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    var titleList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    var descriptionList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        recyclerView = findViewById(R.id.recycleView444)
        titleList.add("Apple")
        titleList.add("Banana")
        titleList.add("Grapes")

        imageList.add(R.drawable.logo)
        imageList.add(R.drawable.lizard)
        imageList.add(R.drawable.girl)

        descriptionList.add("This is logo .....")
        descriptionList.add("This is lizard .....")
        descriptionList.add("This is girl.....")



    var adapter = RecyclerAdapter(titleList , imageList , descriptionList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.naviagete111)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}