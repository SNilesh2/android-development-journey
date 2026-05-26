package com.example.inchtocm

import android.os.Bundle
import android.system.StructCmsghdr
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var convertedCm : TextView
    private lateinit var convertButton : Button
    private lateinit var inchInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        inchInput = findViewById(R.id.inchInput)
        convertedCm = findViewById(R.id.convertedCm)
        convertButton = findViewById(R.id.convertButton)

        val inch = 2.54

        convertButton.setOnClickListener {
            if(inchInput.text.toString().isEmpty())
            {
                convertedCm.text = getString(R.string.text_view_text)
            }
            else
            {
                val result = inchInput.text.toString().toDouble() * inch
                convertedCm.text = result.toString()
            }
        }
    }
}