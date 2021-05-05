package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthDayGreetingActivity : AppCompatActivity() {
    //creating static variable NAME_EXTRA
   companion object{
     const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_greeting)
        //receiving name sent from MainActivity
        val name=intent.getStringExtra(NAME_EXTRA)
        //getting birthdaygreeting id from its xml file
        val greeting=findViewById<TextView>(R.id.textView2)
        greeting.text="HAPPY BIRTHDAY\n$name"
    }
}