package com.example.fitness_knowbodymass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val height = findViewById<EditText>(R.id.editTextTextPersonName2)
    val weight = findViewById<EditText>(R.id.editTextTextPersonName)
    val aboutActivityButton = findViewById<Button>(R.id.button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutActivityButton.setOnClickListener {
            val intent = Intent(this,AboutAppActivity::class.java)
            startActivity(intent)
        }
    }
}