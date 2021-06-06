package com.example.android.hilt.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android.hilt.data.entity.Log

/**
 * SQLite Database for storing the logs.
 */

@Database(entities = [Log::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun logDao(): LogDao
}
