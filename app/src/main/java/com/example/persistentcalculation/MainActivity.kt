package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val button = findViewById<Button>(R.id.button1)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            val userEnter1 = editText1.text.toString().toDouble()
            val userEnter2 = editText2.text.toString().toFloat()
            val mutiply = userEnter1 * userEnter2

            textView.text = "The result is $mutiply"
        }
    }
}