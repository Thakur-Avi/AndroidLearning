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

        class6.setOnClickListener() {
            val intent = Intent(this, classResult::class.java)
            intent.putExtra("class","6th")
            intent.putExtra("roll","2")
            intent.putExtra("sub","Maths, Science, S.St, Hindi, English, Sanskrit")
            intent.putExtra("markso","500")
            intent.putExtra("mmarks","600")
            intent.putExtra("percent","83.33%")
            intent.putExtra("grade","A")
            intent.putExtra("classA","225")
            intent.putExtra("classH","250")
            startActivity(intent)
        }

        class7.setOnClickListener() {
            val intent = Intent(this, classResult::class.java)
            intent.putExtra("class","7th")
            intent.putExtra("roll","5")
            intent.putExtra("sub","Maths, Science, S.St, Hindi, English, Sanskrit")
            intent.putExtra("markso","540")
            intent.putExtra("mmarks","600")
            intent.putExtra("percent","90%")
            intent.putExtra("grade","A+")
            intent.putExtra("classA","220")
            intent.putExtra("classH","250")
            startActivity(intent)
        }

        class8.setOnClickListener() {
            val intent = Intent(this, classResult::class.java)
            intent.putExtra("class","8th")
            intent.putExtra("roll","3")
            intent.putExtra("sub","Maths, Science, S.St, Hindi, English, Sanskrit")
            intent.putExtra("markso","534")
            intent.putExtra("mmarks","600")
            intent.putExtra("percent","89%")
            intent.putExtra("grade","A")
            intent.putExtra("classA","215")
            intent.putExtra("classH","250")
            startActivity(intent)
        }

        class9.setOnClickListener() {
            val intent = Intent(this, classResult::class.java)
            intent.putExtra("class","9th")
            intent.putExtra("roll","2")
            intent.putExtra("sub","Maths, Science, S.St, Hindi, English")
            intent.putExtra("markso","415")
            intent.putExtra("mmarks","500")
            intent.putExtra("percent","83%")
            intent.putExtra("grade","A")
            intent.putExtra("classA","225")
            intent.putExtra("classH","250")
            startActivity(intent)
        }

        class10.setOnClickListener() {
            val intent = Intent(this, classResult::class.java)
            intent.putExtra("class","10th")
            intent.putExtra("roll","1")
            intent.putExtra("sub","Maths, Science, S.St, Hindi, English")
            intent.putExtra("markso","395")
            intent.putExtra("mmarks","500")
            intent.putExtra("percent","79%")
            intent.putExtra("grade","B+")
            intent.putExtra("classA","205")
            intent.putExtra("classH","250")
            startActivity(intent)
        }

        logout.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}