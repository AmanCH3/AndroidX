package com.example.andriodx

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.andriodx.databinding.ActivityLoginPageAcyivityBinding
import com.example.andriodx.databinding.ActivityMessageBinding

class LoginPageAcyivity : AppCompatActivity() {


    lateinit var  pageBinding: ActivityLoginPageAcyivityBinding
    lateinit var  sharedPreferences: SharedPreferences
    var username  : String? = null
    var password : String? = null
    var rememberMe : Boolean? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        pageBinding = ActivityLoginPageAcyivityBinding.inflate((layoutInflater))
        var view = pageBinding.root





        pageBinding.registerButton.setOnClickListener {
            sharedPreferences = this.getSharedPreferences("UserDetails" , MODE_PRIVATE)
            username  = pageBinding.userIDD.text.toString()
            password = pageBinding.passwordID.text.toString()
            rememberMe = pageBinding.rememberMe.isChecked



            var editor = sharedPreferences.edit()
            editor.putString("Username" , username)
            editor.putString("Password" , password)
            editor.putBoolean("remember" , rememberMe!!)


            editor.apply()
            Toast.makeText(applicationContext , "SuccessFully Register", Toast.LENGTH_LONG).show()


        }

        pageBinding.loginButton.setOnClickListener {
            sharedPreferences = this.getSharedPreferences("userDetails" , MODE_PRIVATE)


            val savedUsername = sharedPreferences.getString("username" , "")
            val savedPassword = sharedPreferences.getString("password" ,"")


            val checkUser  = pageBinding.userIDD.text.toString()
            val checkPass = pageBinding.passwordID.text.toString()


            if(checkUser == savedUsername && checkPass == savedPassword){
                val intent = Intent(this , Message_activity:: class.java)
                startActivity(intent)




        } else {

            Toast.makeText(
                applicationContext,
                "Invalid username or password",
                Toast.LENGTH_SHORT
            ).show()
        }
        }




    }
    override fun onPause() {
        sharedPreferences = this.getSharedPreferences("UserDetail", MODE_PRIVATE)

        username = pageBinding.userIDD.text.toString()
        password=pageBinding.passwordID.text.toString()
        rememberMe=pageBinding.rememberMe.isChecked


        var editor=sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("password",password)
        editor.putBoolean("remember",rememberMe!!)

        editor.apply()
        Toast.makeText(applicationContext,"data saved",Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onResume() {
        sharedPreferences = this.getSharedPreferences("UserDetail", MODE_PRIVATE)
        username=sharedPreferences.getString("username","No value")
        password=sharedPreferences.getString("password","No value")
        rememberMe=sharedPreferences.getBoolean("remember",false)
        super.onResume()
        if(rememberMe==true) {
            pageBinding.userIDD.setText(username)
            pageBinding.passwordID.setText(password)
        }
    }

}


