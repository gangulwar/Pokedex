package com.gangulwar.presentation.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gangulwar.util.poppinsFontFamily

@Composable
fun DisplayPokemonView(
    pokemonID: String,
    pokemonImage: ImageBitmap
) {
    Box {
        Text(
            text = pokemonID, style = TextStyle(
                fontFamily = poppinsFontFamily,
                fontSize = 250.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Image(
            modifier = Modifier.align(Alignment.Center).padding(top = 150.dp),
            painter = BitmapPainter(pokemonImage),
            contentDescription = "Pokemon Image"
        )
    }
}