package com.example.textstyle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textstyle.ui.theme.TextStyleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.geologica_auto_bold, FontWeight.Bold),
            Font(R.font.geologica_auto_light, FontWeight.Light),
            Font(R.font.geologica_auto_medium, FontWeight.Medium),
            Font(R.font.geologica_auto_regular, FontWeight.Normal),
            Font(R.font.geologica_auto_semibold, FontWeight.SemiBold),
            Font(R.font.geologica_auto_extralight, FontWeight.ExtraLight)
        )

        enableEdgeToEdge()
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
                    .padding(top = 30.dp)
            )
            {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 55.sp
                            )
                        )
                        {
                            append("J")
                        }
                        append("etPack")

                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 55.sp
                            )
                        )
                        {
                            append("C")
                        }
                        append("ompose")
                    },
                    fontSize = 30.sp,
                    color = Color.White,
                    fontFamily = fontFamily,
                    textDecoration = TextDecoration.LineThrough
                )
            }
        }
    }
}

