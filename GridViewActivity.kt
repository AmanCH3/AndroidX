package com.example.andriodx

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.andriodx.adapter.PinkAdapter

class GridViewActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_view)


        gridView = findViewById(R.id.gridView);

        fillArrays()

        var adpater = PinkAdapter(nameList, imageList)


        gridView.adapter = adpater

        gridView.setOnItemClickListener { adpaterView, view, i, l ->
            Toast.makeText(applicationContext, nameList[i], Toast.LENGTH_LONG).show()


        }
    }


        fun fillArrays() {
            nameList.add("dog")
            nameList.add("flower")
            nameList.add("girl")
            nameList.add("lizard")
            nameList.add("pets")
            nameList.add("plant")
            nameList.add("rose")
            nameList.add("stone")
            nameList.add("wine")
            nameList.add("women")


            imageList.add(R.drawable.dog)
            imageList.add(R.drawable.flower)
            imageList.add(R.drawable.girl)
            imageList.add(R.drawable.lizard)
            imageList.add(R.drawable.pets)
            imageList.add(R.drawable.plant)
            imageList.add(R.drawable.rose)
            imageList.add(R.drawable.stone)
            imageList.add(R.drawable.wine)
            imageList.add(R.drawable.women)


        }
    }
