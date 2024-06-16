package com.example.debitsandcredits.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.debitsandcredits.R

object HomeDestination : NavDest {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    navigateToItemUpdate: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

}