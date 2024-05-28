package com.example.debitsandcredits.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.sql.Date

@Entity (tableName = "DebitsAndCreditsTable",
    indices = [Index(value = ["fkUserId", "fkPaymentType"], unique = true),
        Index(value = ["transId"])]
)
data class DebitsAndCreditsTable(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "transId") val id: Int,
    @ColumnInfo (name = "fkUserId", index = true)
    val fkUserId: Long,
    @ColumnInfo (name = "Date") val date: Date,
    @ColumnInfo ( name = "fkPaymentType", index = true)
    val fkPaymentType: Long
)

@Entity (tableName = "UsersTable")
data class UsersTable (
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "pkUserId") val pkUserId: Int,
    @ColumnInfo (name = "UserName") val userName: String
)