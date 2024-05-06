package com.example.andriodx

import android.graphics.Camera
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var radioCamera: RadioButton
    lateinit var radioPanda: RadioButton
    lateinit var radioTiger: RadioButton
    lateinit var image: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        radioCamera = findViewById(R.id.camera)
        radioPanda= findViewById(R.id.panda)
        radioTiger = findViewById(R.id.tiger)
        image = findViewById(R.id.imageView)


        radioCamera.setOnClickListener {

            image.setImageResource(R.drawable.camera)

        }
        radioPanda.setOnClickListener {

            image.setImageResource(R.drawable.panda)

        }
        radioTiger.setOnClickListener {

            image.setImageResource(R.drawable.tiger)


        }




    }
    }