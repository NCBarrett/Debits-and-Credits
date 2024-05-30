package com.example.debitsandcredits.database

import android.app.Application
import com.example.debitsandcredits.UserRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class CreditsAndDebitsApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy {DebitsAndCreditsDB.getDatabase(this, applicationScope)}
    val repository by lazy { UserRepository(database.Dao()) }
}