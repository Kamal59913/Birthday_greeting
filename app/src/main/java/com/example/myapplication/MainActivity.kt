package com.example.myapplication //package name that swe have written

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CreateBirthDayCard(view: View) {
//finding the editText view from xml
      val nameIntput=findViewById<EditText>(R.id.nameInput)
        val name=nameIntput.editableText.toString()

      //Toast.makeText(this,"Button was Clicked By $name",Toast.LENGTH_LONG).show()
       val intent=Intent(this,BirthDayGreetingActivity::class.java)
        intent.putExtra(BirthDayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}

