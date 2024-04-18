package com.gangulwar.presentation.views

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.unit.dp
import com.gangulwar.util.Constants
import java.io.File

@Composable
fun StartingLogoAnimation() {
    val infiniteTransition = rememberInfiniteTransition()

    val logoSize by infiniteTransition.animateFloat(
        initialValue = 100.0f,
        targetValue = 250.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                800,
                delayMillis = 100,
                easing = LinearOutSlowInEasing
            ),
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = Modifier.fillMaxSize()
            .background(
                Color(255, 203, 5)
            ),
        contentAlignment = Alignment.Center
    ) {
        val imageFile = File(Constants.POKEMON_LOGO_PATH)
        val bitmap = loadImageBitmap(imageFile.inputStream())

        Image(
            modifier = Modifier.size(logoSize.dp),
            painter = BitmapPainter(bitmap),
            contentDescription = "Image"
        )
    }
}