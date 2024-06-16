package com.example.debitsandcredits.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.debitsandcredits.R

object Transactions : NavDest {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun TransactionsScreen(
    navigateToItemEntry: () -> Unit,
    navigateToItemUpdate: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

}