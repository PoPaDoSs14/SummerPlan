package com.example.summerplan.data.repository

import com.example.summerplan.data.database.PlanDao
import com.example.summerplan.data.model.Plan

class PlanRepository(private val planDao: PlanDao) {

    suspend fun insert(plan: Plan) {
        planDao.insert(plan)
    }

    suspend fun getAllPlans(): List<Plan> {
        return planDao.getAllPlans()
    }
}