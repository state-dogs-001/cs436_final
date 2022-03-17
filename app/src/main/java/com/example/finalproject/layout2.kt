package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class layout2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout2)

        // Attributes
        var back2welcome = findViewById<Button>(R.id.back1)
        var startCalculate = findViewById<Button>(R.id.start_calculate)

        // Functions
        // When click on back button it will going to welcome page
        back2welcome.setOnClickListener {
            var activity2intent = Intent(this, MainActivity::class.java)
            startActivity(activity2intent)
        }
        // Click for go to calculator page
        startCalculate.setOnClickListener {
            var activity3intent = Intent(this, layout3::class.java)
            startActivity(activity3intent)
        }
    }
}