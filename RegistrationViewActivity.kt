package com.example.andriodx

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class RegistrationViewActivity : AppCompatActivity() {
    lateinit var radioGroup: RadioGroup
    lateinit var radiofemale: RadioButton
    lateinit var radiomale: RadioButton
    lateinit var country: Spinner
    lateinit var loadCalendarButton: Button
    lateinit var dateOfBirth: TextView
    lateinit var nextButton: Button

    val nationalities = arrayOf(
        "Nepal",
        "China",
        "Pakistan",
        "India",
        "Bhutan",
        "Sri Lanka",
        "Maldives",
        "Indonesia",
        "Afghanistan",
        "Australia",
        "Myanmar",
        "Thailand",
        "England",
        "Italy",
        "Russia",
        "Iran",
        "Iraq",
        "Sudan",
        "Japan",
        "South Korea",
        "Switzerland",
        "New Zealand"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        radiofemale = findViewById(R.id.radiofemale)
        radiomale = findViewById(R.id.radiomale)
        country = findViewById(R.id.country)
        nextButton = findViewById(R.id.nextButton)
        loadCalendarButton = findViewById(R.id.loadCalendar)
        dateOfBirth = findViewById(R.id.dateofbirth)

        // Nationality Spinner Adapter
        val nationalityAdapter = ArrayAdapter(
            this@RegistrationViewActivity,
            android.R.layout.simple_spinner_item,
            nationalities
        )
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
            val alertDialog = AlertDialog.Builder(this@RegistrationViewActivity)
            alertDialog.setTitle("Confirm")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setNegativeButton("No") { _, _ -> }
                .setPositiveButton("Yes") { _, _ ->
                    Toast.makeText(
                        this@RegistrationViewActivity,
                        "Submitted",
                        Toast.LENGTH_SHORT
                    ).show()
                    Toast.makeText(
                        this@RegistrationViewActivity,
                        "Logged in",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            alertDialog.create().show()
        }

        // Load Calendar Button Click Listener
        loadCalendarButton.setOnClickListener {
            loadCalendar(this, dateOfBirth)
        }
    }

    // Date-of-Birth
    private fun loadCalendar(context: Context, dateOfBirthView: TextView) {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            context,
            { _, year, monthOfYear, dayOfMonth ->
                dateOfBirthView.text = "Selected Date: $dayOfMonth/${monthOfYear + 1}/$year"
            },
            year,
            month,
            day
        )

        datePickerDialog.show()
    }
}