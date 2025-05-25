package com.manishsubah.workoutapp.Activity.WorkoutActivity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.manishsubah.workoutapp.Activity.Models.Lession

@Composable
fun ExerciseList(lessions: List<Lession>) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        lessions.forEach { lessions ->
            LessionRow(lessions)
        }
    }
}