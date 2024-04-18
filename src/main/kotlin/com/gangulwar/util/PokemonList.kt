package com.gangulwar.util

import androidx.compose.ui.res.loadImageBitmap
import com.gangulwar.data.Pokemon
import java.io.File


object PokemonList {
    val pokemonList = listOf(
        Pokemon(
            "#0001",
            "Bulbasaur",
            "2' 04\"",
            "Grass",
            "15.2 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/bulbasaur.png").inputStream()),
            grassTypeColor
        ),
        Pokemon(
            "#0002",
            "Ivysaur",
            "3' 03\"",
            "Grass",
            "28.7 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/ivysaur.png").inputStream()),
            grassTypeColor
        ),
        Pokemon(
            "#0003",
            "Venusaur",
            "6' 07\"",
            "Grass",
            "220.5 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/venusaur.png").inputStream()),
            grassTypeColor
        ),
        Pokemon(
            "#0004",
            "Charmander",
            "2' 00\"",
            "Fire",
            "18.7 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/charmander.png").inputStream()),
            fireTypeColor
        ),
        Pokemon(
            "#0005",
            "Charmeleon",
            "3' 07\"",
            "Fire",
            "41.9 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/charmeleon.png").inputStream()),
            fireTypeColor
        ),
        Pokemon(
            "#0006",
            "Charizard",
            "5' 07\"",
            "Fire",
            "199.5 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/charizard.png").inputStream()),
            fireTypeColor
        ),
        Pokemon(
            "#0007",
            "Squirtle",
            "1' 08\"",
            "Water",
            "19.8 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/squirtle.png").inputStream()),
            waterTypeColor
        ),
        Pokemon(
            "#0008",
            "Wartortle",
            "3' 03\"",
            "Water",
            "49.6 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/wartortle.png").inputStream()),
            waterTypeColor
        ),
        Pokemon(
            "#0009",
            "Blastoise",
            "5' 03\"",
            "Water",
            "188.5 lbs",
            loadImageBitmap(File("src/main/resources/pokemon_images/blastoise.png").inputStream()),
            waterTypeColor
        )
    )
}

