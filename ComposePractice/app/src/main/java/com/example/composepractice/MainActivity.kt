package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (
                modifier = Modifier.background(Color.Cyan)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(0.6f)
                    .border(5.dp,Color.Green)
                    .padding(10.dp)
                    .border(10.dp,Color.Gray)
                    .padding(10.dp)
                    .border(15.dp,Color.Magenta)
                    .padding(20.dp)
            ) {
                Text(
                    text = "hello"
                )
                Spacer(
                    modifier = Modifier.height(50.dp)
                )
                Text(
                    text = "hello"
                )
            }
        }
    }
}

