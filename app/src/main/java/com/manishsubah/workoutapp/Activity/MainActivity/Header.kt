package com.manishsubah.workoutapp.Activity.MainActivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.manishsubah.workoutapp.R

@Composable
fun Header() {
    ConstraintLayout(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        val (welcomeRef, nameRef, profileRef) = createRefs()
        Text(
            text = stringResource(R.string.welcome_back),
            color = Color.White,
            modifier = Modifier.constrainAs(welcomeRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )
        Text(
            text = "Edward Hanks",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(nameRef) {
                top.linkTo(welcomeRef.bottom)
                start.linkTo(parent.start)
                bottom.linkTo(profileRef.bottom)
            }
        )
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .constrainAs(profileRef) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                },
            contentScale = ContentScale.Crop
        )
    }
}