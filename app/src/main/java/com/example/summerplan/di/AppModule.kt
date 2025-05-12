package com.example.summerplan.di

import com.example.summerplan.data.database.AppDatabase
import com.example.summerplan.data.repository.NoteRepository
import com.example.summerplan.data.repository.PlanRepository
import com.example.summerplan.data.repository.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module(includes = [RoomModule::class])
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePlanRepository(db: AppDatabase): PlanRepository =
        PlanRepository(db.planDao())

    @Provides
    @Singleton
    fun provideTaskRepository(db: AppDatabase): TaskRepository =
        TaskRepository(db.taskDao())

    @Provides
    @Singleton
    fun provideNoteRepository(db: AppDatabase): NoteRepository =
        NoteRepository(db.noteDao())
}