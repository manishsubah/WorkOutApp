package com.manishsubah.workoutapp.Activity.IntroActivity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.manishsubah.workoutapp.R

@Composable
@Preview
fun IntroScreen(onStartClick:()-> Unit = {}) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.mainColor))
    ) {
        item { IntroHeader() }
        item { IntroDescription() }
        item { IntroActionButton(onStartClick) }
        item { IntroFooter() }
    }

}