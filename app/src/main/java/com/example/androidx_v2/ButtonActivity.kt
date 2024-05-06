package com.example.andriodx

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class ButtonActivity : AppCompatActivity() {
    lateinit var  checkBoxToast: CheckBox
    lateinit var  checkBoxsnackbar: CheckBox
    lateinit var checkBoxDialog: CheckBox
    lateinit var checkBoxbutton : Button
    lateinit var main : ConstraintLayout
    lateinit var  male : ConstraintLayout
//    lateinit var  female : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)


        checkBoxToast = findViewById(R.id.checkBoxtoast)
        checkBoxsnackbar = findViewById(R.id.checkBoxsnack)
        checkBoxDialog = findViewById(R.id.checkBoxdialog)
        checkBoxbutton = findViewById(R.id.checkBoxbutton)
        checkBoxbutton = findViewById(R.id.checkBoxbutton)
        main = findViewById(R.id.naviagete111)
    checkBoxToast.setOnClickListener{

        checkBoxsnackbar.isChecked = false

    }



        checkBoxbutton.setOnClickListener{
            if(checkBoxToast.isChecked){
                //toast
//                Toast.makeText(applicationContext)
                Toast.makeText(this@ButtonActivity,"this is a toast message",Toast.LENGTH_SHORT).show()

            }else if(checkBoxsnackbar.isChecked){
                //snack bar

                Snackbar.make(main,"This is snack bar",Snackbar.LENGTH_SHORT).show()
//                checkBoxsnackbar.isChecked =
                male.setEnabled(false);
            }
            else{
                //Alert Dailog
                AlertDialog.Builder(this@ButtonActivity).setTitle("Alert Alert").setMessage("Do you want to continue").setCancelable(true).setNegativeButton("NO",{dialogInterface
                ,i->}).setPositiveButton("Yes",{dialogInterface,i->}).create().show()
                checkBoxDialog.isChecked = false
                male.setEnabled(false);
            }
        }

        }

    }

