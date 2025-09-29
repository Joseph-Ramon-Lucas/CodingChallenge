package com.example.codingchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.codingchallenge.ui.theme.CodingChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodingChallengeTheme {
                CountingChallengeApp()
            }
        }
    }
}

@Composable
fun CounterDisplayWithButton(modifier: Modifier = Modifier) {
    var counter by remember { mutableStateOf(0) }

    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {counter += 1}) {
            Text("Tap Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CountingChallengeApp(){
    CounterDisplayWithButton(modifier = Modifier.fillMaxSize().wrapContentSize(align = Alignment.Center))
}