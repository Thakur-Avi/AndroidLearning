package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var enter_username: EditText
    lateinit var pass: EditText
    lateinit var bt_submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enter_username = findViewById(R.id.enter_username)
        pass = findViewById(R.id.enter_password)
        bt_submit = findViewById(R.id.bt_submit)

        bt_submit.setOnClickListener() {
            if (pass.text.toString() == "owner") {
                val intent = Intent(this, home_page::class.java)
                intent.putExtra("id",enter_username.text.toString())
                startActivity(intent)
                finish()
                Toast.makeText(this, "Log in", Toast.LENGTH_SHORT).show()
            }
        }


        //declare


    }
}