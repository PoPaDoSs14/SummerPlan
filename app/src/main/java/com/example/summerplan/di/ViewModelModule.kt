package com.example.summerplan.di

import androidx.lifecycle.ViewModel
import com.example.summerplan.presentation.GlobalPlansViewModel
import com.example.summerplan.presentation.NoteViewModel
import com.example.summerplan.presentation.TaskViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ViewModelModule {

    @Binds
    abstract fun bindTaskViewModel(viewModel: TaskViewModel): ViewModel

    @Binds
    abstract fun bindNoteViewModel(viewModel: NoteViewModel): ViewModel

}