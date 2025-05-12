package com.example.summerplan.presentation

import androidx.lifecycle.ViewModel
import com.example.summerplan.data.repository.TaskRepository
import javax.inject.Inject

class TaskViewModel @Inject constructor(
    private val taskRepository: TaskRepository
) : ViewModel() {

    fun getTasksForPlan(planId: Long) {
        // Логика получения задач по ID плана из репозитория
    }
}