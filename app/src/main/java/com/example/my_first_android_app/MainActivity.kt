package com.example.my_first_android_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_first_android_app.ui.theme.MyfirstandroidappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyfirstandroidappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Graham")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box (
        modifier = modifier
            .background(Color.White)
            .size(400.dp)
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
                .align(Alignment.TopStart)
                .background(Color.LightGray)
                .padding(16.dp)
                .background(Color.White)
                .padding(20.dp),
            color = Color.Black,
            fontSize = 42.sp
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = modifier.background(Color.DarkGray)
                .align(Alignment.Center)
        )
        if (name.length < 7) {
            Row(
                modifier = modifier.align(Alignment.BottomStart)
            ) {
                for (i in 1..name.length) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null
                    )
                }
            }
        }
        Text(
            text = "Some other text goes here...",
            modifier = modifier
                .align(Alignment.BottomEnd)
                .background(Color.LightGray)
                .padding(16.dp)
                .background(Color.White)
                .padding(20.dp),
            color = Color.DarkGray,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyfirstandroidappTheme {
        Greeting("Gray")
    }
}