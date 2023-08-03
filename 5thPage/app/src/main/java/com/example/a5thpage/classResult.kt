package com.example.a5thpage

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class classResult : AppCompatActivity() {

    lateinit var sharedPreferences : SharedPreferences
    lateinit var name : TextView
    lateinit var classvar : TextView
    lateinit var roll : TextView
    lateinit var sub : TextView
    lateinit var markso : TextView
    lateinit var mmarks : TextView
    lateinit var percent : TextView
    lateinit var grade : TextView
    lateinit var classa : TextView
    lateinit var classh : TextView
    lateinit var bt_bkhome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_result)

        sharedPreferences = this.getSharedPreferences("login_data", MODE_PRIVATE)
        name = findViewById(R.id.et_name)
        classvar = findViewById(R.id.et_class)
        roll = findViewById(R.id.et_roll)
        sub = findViewById(R.id.et_sub)
        markso = findViewById(R.id.et_markso)
        mmarks = findViewById(R.id.et_mmarks)
        percent = findViewById(R.id.et_percent)
        grade = findViewById(R.id.et_grade)
        classa = findViewById(R.id.et_classA)
        classh = findViewById(R.id.et_classH)
        bt_bkhome = findViewById(R.id.bt_bkhome)

        val set_name = sharedPreferences.getString("user_name",null)
        val set_classvar = intent.getStringExtra("class")
        val set_roll = intent.getStringExtra("roll")
        val set_sub = intent.getStringExtra("sub")
        val set_markso = intent.getStringExtra("markso")
        val set_mmarks = intent.getStringExtra("mmarks")
        val set_percent = intent.getStringExtra("percent")
        val set_grade = intent.getStringExtra("grade")
        val set_classa = intent.getStringExtra("classA")
        val set_classh = intent.getStringExtra("classH")

        name.setText("$set_name")
        classvar.setText("$set_classvar")
        roll.setText("$set_roll")
        sub.setText("$set_sub")
        markso.setText("$set_markso")
        mmarks.setText("$set_mmarks")
        percent.setText("$set_percent")
        grade.setText("$set_grade")
        classa.setText("$set_classa")
        classh.setText("$set_classh")

        bt_bkhome.setOnClickListener() {
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
            finish()
        }

    }
}