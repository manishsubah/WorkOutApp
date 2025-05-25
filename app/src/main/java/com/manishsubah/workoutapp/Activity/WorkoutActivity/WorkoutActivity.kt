package com.manishsubah.workoutapp.Activity.WorkoutActivity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manishsubah.workoutapp.Activity.Models.Workout
import com.manishsubah.workoutapp.R

class WorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val workout = intent.getSerializableExtra("object") as Workout
        setContent {
            WorkoutScreen(
                workout = workout,
                onBack = { finish()},
                onStart = { },
            )
        }
    }
}