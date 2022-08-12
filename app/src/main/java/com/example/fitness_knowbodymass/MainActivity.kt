package com.example.fitness_knowbodymass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height:EditText = findViewById<EditText>(R.id.input_height_edittext)
        val weight:EditText = findViewById<EditText>(R.id.input_weight_edittext)
        val aboutActivityButton:Button = findViewById<Button>(R.id.about_activity_button)
        val convertButton = findViewById<Button>(R.id.convert_button)
        val outputAnswerTextView = findViewById<TextView>(R.id.output_answer)

        val inputHeight = height.text
        val inputWeight = weight.text

        aboutActivityButton.setOnClickListener {
            val intent = Intent(this,AboutAppActivity::class.java)
            startActivity(intent)
        }

        convertButton.setOnClickListener{
            Log.i("answer","" + inputHeight)
            Log.i("answer","" + inputWeight)
            val bmi = inputWeight.toString().toInt()/(inputHeight.toString().toFloat()*inputHeight.toString().toFloat())
            Log.i("answer","" + bmi)
            outputAnswerTextView.text = "%.2f".format(bmi)
        }
    }
}