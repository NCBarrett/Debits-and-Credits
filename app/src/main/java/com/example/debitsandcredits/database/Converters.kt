package com.example.debitsandcredits.database

import androidx.room.TypeConverter
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import java.sql.Date

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let {Date(it)}
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun listFromString(value: String?): List<String> {
        val listType = object : TypeToken<ArrayList<String?>?>() {}.type

    }

    @TypeConverter
    fun stringFromList(list: List<String?>?): String {
        val gson = Gson()
    }
}