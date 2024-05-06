package com.example.andriodx

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var  button19: Button
    lateinit var button20: Button


    var counter  = 0









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new2)
        Log.d("Message" ,"On create called")

        textView = findViewById(R.id.lbltextview)
        button19 = findViewById(R.id.button19)
        button20 = findViewById(R.id.button20)


        button20.setOnClickListener {
            counter += 1
            textView.text ="" +  counter
        }











        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "on Start called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "on Pause called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "on Restart called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "on Stop called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "on Resume called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "on Destory called")
    }

}