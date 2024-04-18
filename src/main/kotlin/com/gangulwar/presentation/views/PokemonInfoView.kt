package com.gangulwar.presentation.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gangulwar.data.Pokemon
import com.gangulwar.util.poppinsFontFamily

@Composable
fun PokemonInfoView(pokemon: Pokemon) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Height", style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Text(
                text = pokemon.height, style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Normal
                )
            )
        }

        Column(
            modifier = Modifier
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Type", style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Text(
                text = pokemon.type, style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Normal
                )
            )

        }

        Column(
            modifier = Modifier
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Weight", style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Text(
                text = pokemon.weight, style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Normal
                )
            )
        }
    }
}