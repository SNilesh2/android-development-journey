package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.Dimension
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.data.DataSource
import com.example.courses.model.Topic
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopicGrid(
                modifier = Modifier
            )
        }
    }
}

@Composable
fun TopicGrid(modifier : Modifier = Modifier)
{
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = spacedBy(8.dp),
        horizontalArrangement = spacedBy(8.dp),
        modifier = modifier
    ) {
        items(DataSource.topics){topic ->
            TopicCard(topic)
        }
    }
}

@Composable
fun TopicCard(topic : Topic, modifier: Modifier = Modifier) {
    Card()
    {
        Row{
            Box {
                Image(
                    painter = painterResource(topic.imageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .size(width = 68.dp, height = 68.dp)
                        .aspectRatio(1f)
                )
            }

            Column() {
                Text(
                    text = stringResource(topic.name),
                    modifier = Modifier
                        .padding(top = 16.dp,bottom = 8.dp,start = 16.dp,end = 16.dp)
                )

                Text(
                    text = topic.availableCourses.toString(),
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
            }
        }
    }
}

