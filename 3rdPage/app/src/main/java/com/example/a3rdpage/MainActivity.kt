package com.example.a3rdpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var bt_camping : LinearLayout
    lateinit var bt_fishig : LinearLayout
    lateinit var bt_packing : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_camping = findViewById(R.id.bt_camping)
        bt_fishig = findViewById(R.id.bt_fishig)
        bt_packing = findViewById(R.id.bt_packing)

        bt_camping.setOnClickListener(){
            val intent = Intent(this,login::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this, "Camping", Toast.LENGTH_SHORT).show()
        }
        bt_fishig.setOnClickListener(){
            Toast.makeText(this, "Fishing", Toast.LENGTH_SHORT).show()
        }
        bt_packing.setOnClickListener(){
            Toast.makeText(this, "Packing", Toast.LENGTH_SHORT).show()
        }
    }
}