package com.manishsubah.workoutapp.Activity.Models

import kotlinx.serialization.Serializable

data class Lession(
    val title: String,
    val duration: String,
    val link: String,
    val picPath: String
): java.io.Serializable
