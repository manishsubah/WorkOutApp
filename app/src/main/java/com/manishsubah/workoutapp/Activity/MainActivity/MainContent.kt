package com.manishsubah.workoutapp.Activity.MainActivity

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.manishsubah.workoutapp.Activity.Models.Workout

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    workouts: List<Workout>
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        Header()
        SearchBar()
        MonitoringSection()
        Spacer(Modifier.height(16.dp))
        BannerCard()
        Spacer(Modifier.height(16.dp))
        OtherWorkoutsHeader()
        Spacer(Modifier.height(16.dp))
        WorkoutList(workouts = workouts)

    }
}