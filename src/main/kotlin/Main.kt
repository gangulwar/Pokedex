import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.gangulwar.data.Pokemon
import com.gangulwar.util.Constants
import com.gangulwar.util.poppinsFontFamily
import java.io.File

@Composable
@Preview
fun App() {
    var pokemonNumber by remember { mutableStateOf(0) }

    MaterialTheme {
        PokemonDisplayScreen(
            pokemon = Constants.pokemonList[pokemonNumber],
            onLeftClick = {
                if (pokemonNumber == 0) {
                    pokemonNumber = Constants.pokemonList.size - 1
                } else {
                    pokemonNumber--
                }
            },
            onRightClick = {
                if (pokemonNumber == Constants.pokemonList.size - 1) {
                    pokemonNumber = 0
                } else {
                    pokemonNumber++
                }
            }
        )
    }
}

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
        val imageFile = File("src/main/resources/pokemon_logo.png")
        val bitmap = loadImageBitmap(imageFile.inputStream())
        Image(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(5.dp),
            painter = BitmapPainter(bitmap),
            contentDescription = "Image"
        )
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box {
            Text(
                text = pokemon.id, style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 250.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Image(
                modifier = Modifier.align(Alignment.Center).padding(top = 150.dp),
                painter = BitmapPainter(pokemon.imageBitmap),
                contentDescription = "Image"
            )
        }

        Text(
            text = pokemon.name, style = TextStyle(
                fontFamily = poppinsFontFamily,
                fontSize = 100.sp,
                fontWeight = FontWeight.Bold
            )
        )

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

    Row(
        modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.clickable(
                onClick = onLeftClick,
            ),
            painter = BitmapPainter(loadImageBitmap(File("src/main/resources/left_arrow.png").inputStream())),
            contentDescription = "Image"
        )

        Image(
            modifier = Modifier.clickable {
                onRightClick()
            },
            painter = BitmapPainter(loadImageBitmap(File("src/main/resources/right_arrow.png").inputStream())),
            contentDescription = "Image"
        )

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
