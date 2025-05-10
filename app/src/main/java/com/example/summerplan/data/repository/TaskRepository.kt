package com.example.summerplan.data.repository

import com.example.summerplan.data.database.TaskDao
import com.example.summerplan.data.model.Task

class TaskRepository(private val taskDao: TaskDao) {

    suspend fun insert(task: Task) {
        taskDao.insert(task)
    }

    suspend fun getTasksForPlan(planId: Long): List<Task> {
        return taskDao.getAllTasks(planId)
    }
}