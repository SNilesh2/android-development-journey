package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var myButton : Button
    private lateinit var myTextView : TextView
    private lateinit var myEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.myButton)
        myTextView = findViewById(R.id.myTextView)
        myEditText = findViewById(R.id.myEditText)

        myButton.text = getString(R.string.button_text)

        myButton.setOnClickListener {
            if(myEditText.text.toString().isEmpty())
            {
                myTextView.visibility = View.VISIBLE
                myTextView.text = getString(R.string.editText_text)
            }
            else
            {
                myTextView.visibility = View.VISIBLE
                myTextView.text = myEditText.text.toString()
            }
        }
    }

}