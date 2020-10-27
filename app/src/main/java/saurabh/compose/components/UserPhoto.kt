package saurabh.compose.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import dev.chrisbanes.accompanist.coil.CoilImage
import kotlin.random.Random

@Preview
@Composable
private fun PreviewUserPhoto(){
    UserPhoto("https://www.tvovermind.com/wp-content/uploads/2018/01/Goku.jpg")
}


@Composable
fun UserPhoto(imageUrl: String, modifier: Modifier = Modifier) {

    val borderColor = remember { randomColor() }

    CoilImage(
        imageUrl,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .border(2.dp, borderColor, CircleShape)
            .padding(4.dp)
            .clip(CircleShape)
            .size(38.dp),
    )
}

private fun randomColor() = Color(
    red = Random.nextInt(0,255),
    blue = Random.nextInt(0,255),
    green = Random.nextInt(0,255)
)
