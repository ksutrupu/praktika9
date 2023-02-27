package com.bignerdranch.androin.praktika9prilozhenie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClick = findViewById(R.id.button12_click)
        buttonClick.setOnClickListener{
            Toast.makeText(this, R.string.toast1_text, Toast.LENGTH_SHORT).show()
        }
        buttonClick = findViewById(R.id.button11_click)
        buttonClick.setOnClickListener{
            Toast.makeText(this, R.string.toast2_text, Toast.LENGTH_SHORT).show()
        }
        buttonClick = findViewById(R.id.button21_click)
        buttonClick.setOnClickListener{
            Toast.makeText(this, R.string.toast1_text, Toast.LENGTH_SHORT).show()
        }
        buttonClick = findViewById(R.id.button22_click)
        buttonClick.setOnClickListener{
            Toast.makeText(this, R.string.toast2_text, Toast.LENGTH_SHORT).show()
        }
        buttonClick = findViewById(R.id.button31_click)
        buttonClick.setOnClickListener{
            Toast.makeText(this, R.string.toast2_text, Toast.LENGTH_SHORT).show()
        }
        buttonClick = findViewById(R.id.button32_click)
        buttonClick.setOnClickListener{
            Toast.makeText(this, R.string.toast1_text, Toast.LENGTH_SHORT).show()
        }

    }
}