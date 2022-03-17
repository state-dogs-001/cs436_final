package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class layout4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout4)

        // Attributes
        var resultBMR = findViewById<TextView>(R.id.result_bmr)
        var back2cal = findViewById<Button>(R.id.back3)
        var getData = this.intent
        var result = getData.getStringExtra("result")
        var arrStrForLogcat = arrayOf("Your BMR", "Equal", result)

        // Functions
        // Show result
        resultBMR.text = "${resources.getString(R.string.result_string)} $result"
        // Show result on Logcat
        for (texts in arrStrForLogcat) {
            Log.v("Result", texts.toString())
        }

        // Back to new calculate
        back2cal.setOnClickListener {
            var activity3intent = Intent(this, layout3::class.java)
            startActivity(activity3intent)
        }
    }
}