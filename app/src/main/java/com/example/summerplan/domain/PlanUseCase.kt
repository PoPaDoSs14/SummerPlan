package com.example.summerplan.domain

import com.example.summerplan.data.model.Plan
import com.example.summerplan.data.repository.PlanRepository

class PlanUseCase(private val repository: PlanRepository) {

    suspend fun createPlan(
        name: String,
        description: String,
        startDate: Long?,
        endDate: Long?
    ): Plan {
        val plan =
            Plan(name = name, description = description, startDate = startDate, endDate = endDate)
        repository.insert(plan)
        return plan
    }

    suspend fun getAllPlans(): List<Plan> {
        return repository.getAllPlans()
    }
}