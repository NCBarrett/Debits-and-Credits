package com.example.debitsandcredits.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    suspend fun insertUser(user: UsersTable)

    @Update
    suspend fun updateUser(user: UsersTable)

    @Transaction
    @Query("SELECT * FROM UsersTable ORDER BY UserName ASC")
    fun getAllUsers(): Flow<List<UsersTable>>

    @Delete
    suspend fun deleteUser(user: UsersTable)

    @Transaction
    @Query("SELECT * FROM PaymentTypeTable ORDER BY paymentType ASC")
    fun getAllPaymentTypes(): Flow<List<PaymentTypeTable>>
}