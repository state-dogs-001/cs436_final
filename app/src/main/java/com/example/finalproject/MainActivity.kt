package com.example.finalproject

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Attributes
        var welcomeText = findViewById<TextView>(R.id.textwelcome)
        var exitButton = findViewById<Button>(R.id.exit)
        var playMusic = findViewById<Button>(R.id.play_music)
        var stopMusic = findViewById<Button>(R.id.stop_music)
        var mp3:MediaPlayer = MediaPlayer.create(this, R.raw.music)

        // Functions
        // Click for play music
        playMusic.setOnClickListener {
            mp3.start()
        }
        // Click for stop music
        stopMusic.setOnClickListener {
            mp3.stop()
        }
        // Click on text welcome and it will going to next page
        welcomeText.setOnClickListener {
            var activity2intent = Intent(this, layout2::class.java)
            startActivity(activity2intent)
        }
        // Exit program
        exitButton.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }
    }
}