package com.example.lemonade

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LamonApp()
            }
        }
    }
}

@Composable
fun LamonApp(modifier: Modifier = Modifier) {

    var result by remember {
        mutableStateOf(1)
    }

    var squeezeCount by remember {
        mutableStateOf(0)
    }

    val imageSource = when(result)
    {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }

    val textSource: String = when(result)
    {
        1 -> stringResource(R.string.LemonTree)
        2 -> stringResource(R.string.Lemon)
        3 -> stringResource(R.string.GlassOfLemonade)
        else -> stringResource(R.string.EmptyGlass)
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = stringResource(R.string.title),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(imageSource),
            contentDescription = "tree image",
            modifier = Modifier
                .background(
                    color = Color(0xFFC3ECD2),
                    shape = RoundedCornerShape(40.dp)
                )
                .border(2.dp, Color(0xFF69CDD8), RoundedCornerShape(40.dp))
                .padding(24.dp)
                .clickable {
                    when(result)
                    {
                        1 -> {
                            squeezeCount = (2..4).random()
                            result = 2
                        }
                        2 -> {
                            squeezeCount--

                            if(squeezeCount==0)
                            {
                                result = 3
                            }
                        }
                        3 -> {
                            result = 4
                        }
                        else -> {
                            result = 1
                        }
                    }
                }
        )

        Spacer(
            modifier = Modifier
                .height(16.dp)
        )

        Text(
            text = textSource,
            fontSize = 18.sp
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        LamonApp()
    }
}