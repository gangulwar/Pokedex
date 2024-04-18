package com.gangulwar.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gangulwar.data.Pokemon
import com.gangulwar.presentation.views.DisplayPokemonView
import com.gangulwar.presentation.views.NavigationHandlerView
import com.gangulwar.presentation.views.PokemonInfoView
import com.gangulwar.util.Constants
import com.gangulwar.util.poppinsFontFamily
import java.io.File

@Composable
fun PokemonDisplayScreen(
    pokemon: Pokemon,
    onLeftClick: () -> Unit,
    onRightClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(pokemon.backgroundColor)
    ) {
        val imageFile = File(Constants.POKEMON_LOGO_PATH)
        val bitmap = loadImageBitmap(imageFile.inputStream())

        Image(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(5.dp),
            painter = BitmapPainter(bitmap),
            contentDescription = "Pokemon Logo"
        )
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        DisplayPokemonView(
            pokemonID = pokemon.id,
            pokemonImage = pokemon.imageBitmap
        )

        Text(
            text = pokemon.name, style = TextStyle(
                fontFamily = poppinsFontFamily,
                fontSize = 100.sp,
                fontWeight = FontWeight.Bold
            )
        )

        PokemonInfoView(pokemon = pokemon)
    }

    NavigationHandlerView(
        onLeftClick = onLeftClick,
        onRightClick = onRightClick
    )
}