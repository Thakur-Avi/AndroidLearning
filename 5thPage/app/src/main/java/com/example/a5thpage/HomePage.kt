package com.example.a5thpage

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class HomePage : AppCompatActivity() {

    lateinit var logout: Button
    lateinit var set_email : TextView
    lateinit var set_name : TextView
    lateinit var class6 : LinearLayout
    lateinit var class7 : LinearLayout
    lateinit var class8 : LinearLayout
    lateinit var class9 : LinearLayout
    lateinit var class10 : TextView

    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        logout = findViewById(R.id.logout)
        set_email = findViewById(R.id.set_email)
        set_name = findViewById(R.id.set_name)

       class6 = findViewById(R.id.bt_class6)
        class7 = findViewById(R.id.bt_class7)
        class8 = findViewById(R.id.bt_class8)
        class9 = findViewById(R.id.bt_class9)
        class10 = findViewById(R.id.bt_class10)

        sharedPreferences = this.getSharedPreferences("login_data", MODE_PRIVATE)




        val email = sharedPreferences.getString("user_email",null)
        val name = sharedPreferences.getString("user_name",null)

        set_email.setText("$email")
        set_name.setText("$name")


        logout.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}