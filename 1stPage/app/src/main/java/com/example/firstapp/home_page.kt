package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class home_page : AppCompatActivity() {
    lateinit var user_name : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        user_name = findViewById(R.id.user_name)

        val id = intent.getStringExtra("id")

        user_name.setText("$id")
    }
}