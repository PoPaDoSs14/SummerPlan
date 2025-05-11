package com.example.summerplan.domain

import com.example.summerplan.data.model.Task
import com.example.summerplan.data.repository.TaskRepository

class TaskUseCase(private val repository: TaskRepository) {

    suspend fun createTask(name: String, description: String, difficulty: Int, planId: Long): Task {
        val task = Task(name = name, description = description, difficulty = difficulty, planId = planId)
        repository.insert(task)
        return task // Возвращаем созданную задачу.
    }

    suspend fun getTasksForPlan(planId: Long): List<Task> {
        return repository.getTasksForPlan(planId)
    }
}