package com.example.debitsandcredits.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.debitsandcredits.R

object OtherParties : NavDest {
    override val route = "other parties"
    override val titleRes = R.string.app_name
}

@Composable
fun OtherPartiesScreen(
    navigateToParty: () -> Unit,
    navigateToPartyUpdate: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

}