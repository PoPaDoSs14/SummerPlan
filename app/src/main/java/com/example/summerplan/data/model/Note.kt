package com.example.summerplan.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val title: String,
    val content: String,
    val createdAt: Long? = null, // Время создания заметки в миллисекундах
    val taskId: Long? // Внешний ключ на задачу (если заметка связана с задачей)
)
