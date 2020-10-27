package saurabh.compose.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Preview
@Composable
fun ChatItem() {
    Row {
        UserPhoto(imageUrl = "https://www.tvovermind.com/wp-content/uploads/2018/01/Goku.jpg")
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Row {
                Text("Ali Conors", style = MaterialTheme.typography.body1)
                Spacer(Modifier.width(8.dp))
                Text(
                    "3:30 PM",
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.align(Alignment.Bottom),
                    fontWeight = FontWeight.Light,
                    color = Color.Gray
                )
            }
            Spacer(Modifier.height(4.dp))
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = Color.LightGray
            ) {
                ChatText("Yeah I've been mainly referring to Compose Sample 👍🏻")
            }
        }
    }

}