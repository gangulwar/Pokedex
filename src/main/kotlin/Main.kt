import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.gangulwar.presentation.*
import com.gangulwar.util.Constants

fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = Constants.APPLICATION_NAME,
        icon = painterResource(Constants.POKEBALL_ICON_PATH),
        state = WindowState(
            size = DpSize(800.dp, 800.dp),
            placement = WindowPlacement.Maximized
        )
    ) {
        Pokedex()
    }
}