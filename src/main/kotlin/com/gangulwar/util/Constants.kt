package com.gangulwar.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import com.gangulwar.data.Pokemon
import java.io.File


object Constants {
    val pokemonList = listOf(
        Pokemon(
            "0001",
            "Bulbasaur",
            "2' 04\"",
            "Grass",
            "15.2 lbs",
            loadImageBitmap(File("src/main/resources/bulbasaur.png").inputStream()),
            Color(138, 202, 175)
        ),
        Pokemon(
            "0004",
            "Charmander",
            "2' 00\"",
            "Fire",
            "18.7 lbs",
            loadImageBitmap(File("src/main/resources/charmander.png").inputStream()),
            Color(254, 163, 111)
        ),
        Pokemon(
            "0007",
            "Squirtle",
            "1' 08\"",
            "Water",
            "19.8 lbs",
            loadImageBitmap(File("src/main/resources/squirtle.png").inputStream()),
            Color(150, 212, 208)
        )
    )
}


val poppinsFontFamily = FontFamily(
    Font("fonts/Poppins-Regular.ttf", FontWeight.Normal),
    Font("fonts/Poppins-SemiBold.ttf", FontWeight.SemiBold),
    Font("fonts/Poppins-Bold.ttf", FontWeight.Bold)
)