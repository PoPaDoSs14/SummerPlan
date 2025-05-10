package com.example.summerplan.data.repository

import com.example.summerplan.data.database.NoteDao
import com.example.summerplan.data.model.Note

class NoteRepository(private val noteDao: NoteDao) {

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    suspend fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes()
    }
}