package com.example.summerplan.domain

import com.example.summerplan.data.model.Note
import com.example.summerplan.data.repository.NoteRepository

class NoteUseCase(private val repository: NoteRepository) {

    suspend fun createNote(title: String, text: String, taskId: Long): Note {
        val note = Note(title = title, content = text, taskId = taskId)
        repository.insert(note)
        return note // Возвращаем созданную заметку.
    }

    suspend fun getAllNotes(): List<Note> {
        return repository.getAllNotes()
    }
}