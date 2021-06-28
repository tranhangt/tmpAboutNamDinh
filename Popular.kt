package com.example.aboutnamdinh

import androidx.annotation.DrawableRes

data class Popular(
    val name: String,
    val description: String,
    @DrawableRes
    val image: Int?
)