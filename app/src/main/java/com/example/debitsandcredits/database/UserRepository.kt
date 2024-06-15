package com.example.debitsandcredits.database

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class UserRepository (private val Dao: Dao) {

    val allUsers: Flow<List<UsersTable>> = Dao.getAllUsers()
    val allPymtTypes: Flow<List<PaymentTypeTable>> = Dao.getAllPaymentTypes()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertUser(user: UsersTable) = Dao.insertUser(user)

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun updateUser(user: UsersTable) = Dao.updateUser(user)

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun deleteUser(user: UsersTable) = Dao.deleteUser(user)
}