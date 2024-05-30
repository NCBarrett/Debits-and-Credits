package com.example.debitsandcredits.database

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.sql.Date

@Entity (tableName = "DebitsAndCreditsTable",
    indices = [Index(value = ["fkUserId", "fkPaymentType"], unique = true),
        Index(value = ["transId"])]
)
data class DebitsAndCreditsTable(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "transId") val id: Int,
    @ColumnInfo (name = "fkUserId", index = true) val fkUserId: Long,
    @ColumnInfo (name = "Date") val date: Date,
    @ColumnInfo (name = "fkPaymentType", index = true) val fkPaymentType: Long,
    @ColumnInfo (name = "fkOtherParty") val fkOtherParty: Long
)

@Entity
data class UsersTable (
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "pkUserId") val pkUserId: Int,
    @ColumnInfo (name = "UserName") val userName: String,
    @ColumnInfo (name = "usePic") val userPic: String
)

@Entity
data class PaymentTypeTable (
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "pkTypeId") val pkTypeId: Int,
    @ColumnInfo (name = "paymentType") val paymentType: String
)

data class TransAndUser (
    @Embedded val table: DebitsAndCreditsTable,
    @Relation(
        parentColumn = "fkUserId",
        entityColumn = "pkUserId"
    )
    val users: List<UsersTable>
)

data class TransPaymentType (
    @Embedded val table: DebitsAndCreditsTable,
    @Relation(
        parentColumn = "fkPaymentType",
        entityColumn = "pkTypeId"
    )
    val payTypes: List<PaymentTypeTable>
)
