package com.manishsubah.workoutapp.Activity.WorkoutActivity

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manishsubah.workoutapp.R

@Composable
fun StartWorkoutButton(onStart:()-> Unit) {
    Button(
        onClick = onStart,
        shape = RoundedCornerShape(100.dp),
        colors = ButtonDefaults.buttonColors(contentColor = colorResource(R.color.orange)),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Text(stringResource(R.string.start_workout), color = Color.White, fontSize = 18.sp)
    }
}