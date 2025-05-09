package com.example.summerplan.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.summerplan.data.model.Plan

@Dao interface PlanDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(plan: Plan)

    @Query("SELECT * FROM plans")
    suspend fun getAllPlans(): List<Plan>
}