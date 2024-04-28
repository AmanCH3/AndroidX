package com.example.andriodx

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.DatePicker
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class RegistrationFormActivity : AppCompatActivity() {
    lateinit var  radioGroup: RadioGroup

     lateinit var radiofemale: RadioButton
    lateinit var radiomale: RadioButton
     lateinit var radioother: RadioButton
    lateinit var country: Spinner
     lateinit var loadCalendarButton: Button
    lateinit var dateOfBirth: TextView
    lateinit var nextButton: Button
    val nationalities = arrayOf(
        "Nepal", "China", "Pakistan", "India", "Bhutan", "Sri Lanka", "Maldives", "Indonesia", "Afghanistan", "Australia",
        "Myanmar", "Thailand", "England", "Italy", "Russia", "Iran", "Iraq", "Sudan", "Japan", "South Korea", "Switzerland", "New Zealand"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration_form)

        radioGroup = findViewById(R.id.radioGroup)
        radiofemale = findViewById(R.id.radiofemale)
        radiomale = findViewById(R.id.radiomale)
        country = findViewById(R.id.country)
        nextButton = findViewById(R.id.nextButton)

        loadCalendarButton= findViewById(R.id.loadCalendarButton)
        dateOfBirth = findViewById(R.id.dateofbirth)



        val nationalityAdapter = ArrayAdapter(this@RegistrationFormActivity, android.R.layout.simple_spinner_item, nationalities)
        nationalityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        country.adapter = nationalityAdapter


        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radiofemale -> {
                    radiomale.isChecked = false

                }

                R.id.radiomale -> {
                    radiofemale.isChecked = false
                }

            }


        }
        nextButton.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this@RegistrationFormActivity)
            alertDialog.setTitle("Confirm")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setNegativeButton("No") { _, _ -> }
                .setPositiveButton("Yes") { _, _ ->
                    Toast.makeText(this@RegistrationFormActivity, "Submitted", Toast.LENGTH_SHORT).show()
                    Toast.makeText(this@RegistrationFormActivity, "Logged in", Toast.LENGTH_SHORT).show()
                }
            alertDialog.create().show()
        }

        // Load Calendar Button Click Listener
        loadCalendarButton.setOnClickListener {
            loadCalendar()
        }



        fun loadCalendar() {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                    dateOfBirth.text = "$year/${monthOfYear + 1}/$dayOfMonth"
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
        }



    }

    private fun loadCalendar() {
//        TODO("Not yet implemented")
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this@RegistrationFormActivity ,DatePickerDialog.OnDateSetListener{_, year, monthOfYear, dayOfMonth ->
            dateOfBirth.text = "$year/${monthOfYear + 1}/$dayOfMonth"},
            year,
            month,
            day
        )
        datePickerDialog.show()
    }
}