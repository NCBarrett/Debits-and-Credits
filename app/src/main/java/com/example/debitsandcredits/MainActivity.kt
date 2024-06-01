package com.example.debitsandcredits

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.debitsandcredits.ui.theme.DebitsAndCreditsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DebitsAndCreditsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column {
        Column {
            Text(
                text = "Number of Open Transactions",
                color = Color.White
            )
            TextField(value = "", onValueChange = { "" })
            Text(
                text = "Number of Other Parties",
                color = Color.White
            )
            TextField(value = "", onValueChange = { "" })
        }
        Row (

        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Transactions")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Settings")
                }
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Other Parties")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Account")
                }
            }
        }
    }

}

@Preview
@Composable
fun MainScreenPreview() {
    DebitsAndCreditsTheme {
        MainScreen()
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DebitsAndCreditsTheme {
        Greeting("Android")
    }
}*/
