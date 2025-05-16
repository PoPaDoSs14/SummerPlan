package com.example.summerplan.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.summerplan.data.model.Plan
import com.example.summerplan.data.repository.PlanRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class GlobalPlansViewModel @Inject constructor(
    private val planRepository: PlanRepository
) : ViewModel() {

    private val _plans = MutableStateFlow<List<Plan>>(emptyList())
    val plans: StateFlow<List<Plan>> = _plans

    init {
        loadPlans()
    }

    private fun loadPlans() {
        viewModelScope.launch {
            val allPlans = planRepository.getAllPlans()
            _plans.value = allPlans
        }
    }
}