package com.example.colorapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var view : View
    private lateinit var floatingActionButton: FloatingActionButton

    private val colors = arrayOf(Color.RED,Color.BLACK, Color.BLUE, Color.GRAY,Color.GREEN,Color.YELLOW,Color.CYAN)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.view)
        floatingActionButton = findViewById(R.id.floating_button)

        floatingActionButton.setOnClickListener {
            view.setBackgroundColor(colors[Random.nextInt(colors.size)])
        }
    }
}