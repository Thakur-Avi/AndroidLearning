package com.example.a5thpage

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var create_acc: TextView
    lateinit var bt_submit: Button
    lateinit var enter_username: EditText
    lateinit var enter_password: EditText


    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        create_acc = findViewById(R.id.create_acc)
        bt_submit = findViewById(R.id.bt_submit)
        enter_username = findViewById(R.id.enter_username)
        enter_password = findViewById(R.id.enter_password)

        sharedPreferences = this.getSharedPreferences("login_data", MODE_PRIVATE)

        val email = sharedPreferences.getString("user_email",null)
        val pass = sharedPreferences.getString("suer_pass",null)

        if(email == null  || pass == null){
            Toast.makeText(this, "Please create your account !", Toast.LENGTH_SHORT).show()
        }

        create_acc.setOnClickListener(){
            val intent = Intent(this, Create_account::class.java)
            startActivity(intent)
            finish()
        }

        bt_submit.setOnClickListener(){
            if(enter_username.text.toString() == "$email" && enter_password.text.toString() == "$pass") {
                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "Id is not exist!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}