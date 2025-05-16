package com.example.summerplan.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.summerplan.data.model.Plan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GlobalPlansScreen(
    viewModel: GlobalPlansViewModel
) {
    val plans by viewModel.plans.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Все планы") }
            )
        }
    ) { paddingValues ->
        if (plans.isEmpty()) {
            // Показать сообщение или индикатор загрузки, если планы еще не загружены или их нет
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Нет доступных планов")
            }
        } else {
            LazyColumn(
                modifier = Modifier.padding(paddingValues)
            ) {
                items(plans) { plan ->
                    PlanItem(plan)
                }
            }
        }
    }
}

@Composable
fun PlanItem(plan: Plan) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = plan.name, style = MaterialTheme.typography.bodyMedium)
            // Можно добавить дополнительные поля или действия по необходимости
        }
    }
}