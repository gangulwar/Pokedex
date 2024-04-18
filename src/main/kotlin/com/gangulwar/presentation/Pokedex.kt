package com.gangulwar.presentation

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.gangulwar.presentation.views.StartingLogoAnimation
import com.gangulwar.util.PokemonList
import kotlinx.coroutines.delay

@Composable
@Preview
fun Pokedex() {
    var pokemonNumber by remember { mutableStateOf(0) }
    var showLogo by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(3000)
        showLogo = false
        delay(1000)
    }

    MaterialTheme {

        if (showLogo) {
            StartingLogoAnimation()
        } else {
            PokemonDisplayScreen(
                pokemon = PokemonList.pokemonList[pokemonNumber],
                onLeftClick = {
                    if (pokemonNumber == 0) {
                        pokemonNumber = PokemonList.pokemonList.size - 1
                    } else {
                        pokemonNumber--
                    }
                },
                onRightClick = {
                    if (pokemonNumber == PokemonList.pokemonList.size - 1) {
                        pokemonNumber = 0
                    } else {
                        pokemonNumber++
                    }
                }
            )
        }
    }
}