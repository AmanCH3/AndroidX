package com.example.andriodx

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.andriodx.databinding.ActivityMessageBinding

class Message_activity : AppCompatActivity() {
    lateinit var messageBinding: ActivityMessageBinding
    var counter = 0
    lateinit var sharedPreferences : SharedPreferences


    var username : String? = null
    var message : String? = null
    var rememberMe : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        messageBinding = ActivityMessageBinding.inflate(layoutInflater)
        var view = messageBinding.root
        setContentView(view)

        messageBinding.btnCounter.setOnClickListener {
            counter++
            messageBinding.btnCounter.text = counter.toString()




        }












        setContentView(R.layout.activity_message)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onPause() {
        sharedPreferences = this.getSharedPreferences("Uservalue", MODE_PRIVATE)

        username = messageBinding.userText.text.toString()
        message = messageBinding.idMessage.text.toString()
        rememberMe = messageBinding.checkBox.isChecked.toString()

        var editor=sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("message",message)
        editor.putInt("counter",counter)
        editor.putString("remember",rememberMe!!)

        editor.apply()
        Toast.makeText(applicationContext, "data saved", Toast.LENGTH_SHORT).show()

        super.onPause()
    }
    override fun onResume() {
        sharedPreferences = this.getSharedPreferences("UserValue", MODE_PRIVATE)
        username=sharedPreferences.getString("username","No value")
        message=sharedPreferences.getString("message","No value")
        rememberMe= sharedPreferences.getString("remember","")
        counter=sharedPreferences.getInt("counter",0)
        super.onResume()

        messageBinding.userText.setText(username)
        messageBinding.idMessage.setText(message)
//        messageBinding.checkBox.isChecked=rememberMe!!
        messageBinding.btnCounter.text=counter.toString()
    }
}