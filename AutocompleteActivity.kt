package com.example.andriodx

import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ArrayAdapter as ArrayAdapter

class AutocompleteActivity : AppCompatActivity() {
//    private lateinit var autoCompleteTextView: AutoCompleteTextView
//    private lateinit var clickMe: Button
//    private lateinit var main: ConstraintLayout
    private val languages = arrayOf("nepali","Hindi","English","Chinese")
    private lateinit var autoCompleteTextView: AutoCompleteTextView
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete)
    autoCompleteTextView = findViewById(R.id.autoCompleteTextView)

//    val autocompleteAdapter = ArrayAdapter(/* context = */ this@AutocompleteActivity,/* resource = */
//        andriod.R.layout.simple_dropdown.item_1line/* resource = */
//        languages)
//    autoCompleteTextView.setAdapter(autocompleteAdapter)
//    autoCompleteTextView.threshold = 1
//
//        autoCompleteTextView = findViewById(R.id.autoCompleteTextView)
//        clickMe = findViewById(R.id.Clickme)
//        main = findViewById(R.id.main)
//
//        // Set up the autocomplete adapter
//        val suggestions = arrayOf("Apple", "Banana", "Cherry", "Date", "Elderberry")
//        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, suggestions)
//        autoCompleteTextView.setAdapter(adapter)
//
//        clickMe.setOnClickListener {
//            val toastMessage = "This is a toast message"
//            Toast.makeText(this@AutocompleteActivity, toastMessage, Toast.LENGTH_SHORT).show()
//            autoCompleteTextView.setText(toastMessage)
//        }
    }
}