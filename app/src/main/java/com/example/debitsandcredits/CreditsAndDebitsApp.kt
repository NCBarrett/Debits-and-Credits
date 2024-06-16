package com.example.debitsandcredits

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.debitsandcredits.ui.theme.DebitsAndCreditsTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column {
        modifier.fillMaxWidth(1f)
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