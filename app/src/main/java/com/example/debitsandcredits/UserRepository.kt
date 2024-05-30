package com.example.debitsandcredits

import androidx.annotation.WorkerThread
import com.example.debitsandcredits.database.Dao
import com.example.debitsandcredits.database.UsersTable
import kotlinx.coroutines.flow.Flow

class UserRepository (private val Dao: Dao) {

    val allUsers: Flow<List<UsersTable>> = Dao.getAllUsers()

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