package com.example.android.hilt.di.database

import android.content.Context
import androidx.room.Room
import com.example.android.hilt.data.db.AppDatabase
import com.example.android.hilt.data.db.LogDao
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Uddhav P. Gautam <upgautam@ualr.edu> on 6/4/2021.
 */

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "logging.db"
        ).build()
    }

    @Provides
    fun provideLogDao(database: AppDatabase): LogDao {
        return database.logDao() //you instantiated logDao here
    }
}