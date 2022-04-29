package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var upButton : Button
    private lateinit var downButton: Button
    private lateinit var counterDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = 0

        upButton = findViewById(R.id.up_counter)
        downButton = findViewById(R.id.down_counter)
        counterDisplay = findViewById(R.id.main_counter)

        counterDisplay.setText("$counter")

        upButton.setOnClickListener{
            counter += 1
            counterDisplay.setText("$counter")
        }
        downButton.setOnClickListener{
            counter -= 1
            counterDisplay.setText("$counter")
        }

    }
}