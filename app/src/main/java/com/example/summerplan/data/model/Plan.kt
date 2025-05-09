package com.example.summerplan.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "plans")
data class Plan(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val description: String,
    val startDate: Long, // Дата начала плана в миллисекундах
    val endDate: Long // Дата окончания плана в миллисекундах
)
