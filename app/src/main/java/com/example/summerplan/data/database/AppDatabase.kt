package com.example.summerplan.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.summerplan.data.model.Note
import com.example.summerplan.data.model.Plan
import com.example.summerplan.data.model.Task

@Database(entities = [Plan::class, Task::class, Note::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun planDao(): PlanDao
    abstract fun taskDao(): TaskDao
    abstract fun noteDao(): NoteDao

    companion object {
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                val newInstance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "summer_plans.db"
                ).build()
                instance = newInstance
                newInstance
            }
        }
    }
}