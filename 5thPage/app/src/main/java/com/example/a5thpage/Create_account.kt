package com.example.a5thpage

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.nio.file.attribute.AclEntry.Builder

class Create_account : AppCompatActivity() {

    lateinit var create_acc:  TextView
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var pass: EditText
    lateinit var m_number: EditText
    lateinit var gender: EditText
    lateinit var login: TextView

    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor : Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        create_acc = findViewById(R.id.bt_create)
        email = findViewById(R.id.email)
        name = findViewById(R.id.name)
        pass = findViewById(R.id.pass)
        m_number = findViewById(R.id.m_number)
        gender = findViewById(R.id.gender)
        login = findViewById(R.id.login)

        sharedPreferences = this.getSharedPreferences("login_data", MODE_PRIVATE)
        editor = sharedPreferences.edit()


        create_acc.setOnClickListener(){
            //intent.putExtra("email", email.text.toString())
            //intent.putExtra("pass",pass.text.toString())
            if(email.text.isNotEmpty() && name.text.isNotEmpty() && pass.text.isNotEmpty() && m_number.text.isNotEmpty() && gender.text.isNotEmpty()){
                editor.putString("user_email",email.text.toString())
                editor.putString("user_name",name.text.toString())
                editor.putString("user_pass",pass.text.toString())
                editor.apply()
                editor.commit()

                val Builder = AlertDialog.Builder(this)

                Builder.setTitle("Notification")
                Builder.setMessage("Accound has been successfully created !")

                Builder.setPositiveButton("Ok"){ _ , _ ->
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }

                Builder.setCancelable(false)
                Builder.show()
            }

            else{
                Toast.makeText(this, "All Fields are Mandatory", Toast.LENGTH_SHORT).show()
            }
        }

        login.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}