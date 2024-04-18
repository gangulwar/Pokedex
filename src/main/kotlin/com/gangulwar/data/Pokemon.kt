package com.gangulwar.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap

data class Pokemon (
    val id:String,
    val name:String,
    val height:String,
    val type:String,
    val weight:String,
    val imageBitmap: ImageBitmap,
    val backgroundColor: Color
)
