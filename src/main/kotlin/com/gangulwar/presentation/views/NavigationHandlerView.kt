package com.gangulwar.presentation.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.unit.dp
import com.gangulwar.util.Constants
import java.io.File

@Composable
fun NavigationHandlerView(
    onLeftClick: () -> Unit,
    onRightClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(
                start = 10.dp,
                end = 10.dp
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.clickable(
                onClick = onLeftClick,
            ),
            painter = BitmapPainter(loadImageBitmap(File(Constants.LEFT_ARROW_IMAGE_PATH).inputStream())),
            contentDescription = "LEFT ARROW IMAGE"
        )

        Image(
            modifier = Modifier.clickable {
                onRightClick()
            },
            painter = BitmapPainter(
                loadImageBitmap(
                    File(
                        Constants.RIGHT_ARROW_IMAGE_PATH
                    ).inputStream()
                )
            ),
            contentDescription = "RIGHT ARROW IMAGE"
        )
    }
}