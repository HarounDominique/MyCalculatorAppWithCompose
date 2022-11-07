package com.example.mycalculatorappwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycalculatorappwithcompose.ui.theme.MyCalculatorAppWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalculatorAppWithComposeTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyCalculatorAppWithComposeTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFF35407A))){
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(25f)){

            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(25f)){
                Text("1"); Text("2"); Text("3");
                Text("4"); Text("5"); Text("6")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(25f)){
                Text("7"); Text("8"); Text("9")
                Text("0")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(25f)){

            }
        }
    }
}