package com.example.finalproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class layout3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout3)

        // Attributes
        // Inputs
        var genderIsMen = findViewById<RadioButton>(R.id.gender_1)
        // var genderIsWomen = findViewById<RadioButton>(R.id.gender_2)
        var agesInput = findViewById<EditText>(R.id.ages_input)
        var weightInput = findViewById<EditText>(R.id.weight_input)
        var heightInput = findViewById<EditText>(R.id.height_input)
        // Buttons
        var back2cal = findViewById<Button>(R.id.back2)
        var calculateButton = findViewById<Button>(R.id.cal_btn)

        // Functions
        // Calculate Handle
        calculateButton.setOnClickListener {
            var result = if (genderIsMen.isChecked) {
                66 + (13.7 * weightInput.text.toString()
                    .toFloat()) + (5 * heightInput.text.toString()
                    .toFloat()) - (6.8 * agesInput.text.toString().toInt())
            } else {
                655 + (9.6 * weightInput.text.toString()
                    .toFloat()) + (1.8 * heightInput.text.toString()
                    .toFloat()) - (4.7 * agesInput.text.toString().toInt())
            }

            // Send result to next page
            var activity4intent = Intent(this, layout4::class.java)
            activity4intent.putExtra("result", result.toString())
            startActivity(activity4intent)
        }
        // When click back it will going to start page
        back2cal.setOnClickListener {
            var activity3intent = Intent(this, layout2::class.java)
            startActivity(activity3intent)
        }
    }
}