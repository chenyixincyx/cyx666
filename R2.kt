package com.example.r2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.r2.ui.theme.R2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            R2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun BoxDemo(color:Color,context:String) {
    Box(
        modifier = Modifier
            .width(133.dp)
            .fillMaxHeight()
            .background(color),
        contentAlignment = Alignment.Center
    ){this:BoxScope
        Text(text = context)
    }
}

@Composable
fun RowRGB() {
    Row() { this:RowScope
        BoxDemo(color = Red, context ="红色" )
        BoxDemo(color = Green, context = "绿色")
        BoxDemo(Color= Blue, context = "蓝色")
    }
}