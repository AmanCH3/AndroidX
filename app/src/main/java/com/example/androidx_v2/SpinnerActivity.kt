package com.example.andriodx

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener
{
    lateinit var textview: TextView
    lateinit var spinner : Spinner
    var data = arrayOf("Nepal" , "China","Bhutan","Pakistan")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)


       textview = findViewById(R.id.textView11)
        spinner = findViewById(R.id.spinners)

        var arrayAdapter = ArrayAdapter(this@SpinnerActivity,android.R.layout.simple_spinner_item,data)

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=arrayAdapter
        spinner.onItemSelectedListener = this
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        if(parent != null){

            textview.text = parent.getItemAtPosition(position).toString()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}