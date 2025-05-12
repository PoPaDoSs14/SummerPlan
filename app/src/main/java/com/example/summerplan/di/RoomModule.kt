package com.example.summerplan.di

import android.content.Context
import androidx.room.Room
import com.example.summerplan.data.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideDatabase(appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(database: AppDatabase): AppDatabase = database
}