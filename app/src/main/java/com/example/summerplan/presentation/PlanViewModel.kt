package com.example.summerplan.presentation

import androidx.lifecycle.ViewModel
import com.example.summerplan.data.repository.PlanRepository
import javax.inject.Inject

class PlanViewModel @Inject constructor(
    private val planRepository: PlanRepository
) : ViewModel() {

    fun getAllPlans() {
        // Логика получения всех планов из репозитория
    }
}