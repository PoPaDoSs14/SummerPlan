package com.example.summerplan.presentation

import androidx.lifecycle.ViewModel
import com.example.summerplan.data.repository.NoteRepository
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    private val noteRepository: NoteRepository
) : ViewModel() {

    fun getNotesForTask(taskId: Long) {
        // Логика получения заметок по ID задачи из репозитория
    }
}