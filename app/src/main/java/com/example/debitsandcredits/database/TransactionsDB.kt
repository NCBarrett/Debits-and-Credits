package com.example.debitsandcredits.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
import kotlin.concurrent.Volatile

@Database(
    entities = [DebitsAndCreditsTable::class, UsersTable::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(Converters::class)
abstract class DebitsAndCreditsDB : RoomDatabase() {
    abstract fun Dao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: DebitsAndCreditsDB ? = null

        @OptIn(InternalCoroutinesApi::class)
        fun getDatabase(context: Context, scope: CoroutineScope): DebitsAndCreditsDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DebitsAndCreditsDB::class.java,
                    "DebitsAndCredits"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}