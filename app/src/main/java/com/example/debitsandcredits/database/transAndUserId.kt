package com.example.debitsandcredits.database

import androidx.room.Embedded
import androidx.room.Relation

data class TransAndUserId {
    @Embedded val trans: DebitsAndCreditsTable,
    @Relation(
        parentColumn = "",
        entityColumn = ""
    )
    val users: List<UsersTable>
}