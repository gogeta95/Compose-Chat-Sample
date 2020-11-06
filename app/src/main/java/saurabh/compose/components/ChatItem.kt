package saurabh.compose.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun ChatItem(authorName: String, authorImageUrl: String, dateSent: String, text: String) {
    Row {
        UserPhoto(imageUrl = authorImageUrl)
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Row {
                Text(authorName, style = MaterialTheme.typography.body1)
                Spacer(Modifier.width(8.dp))
                Text(
                    dateSent,
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.align(Alignment.Bottom),
                    fontWeight = FontWeight.Light,
                    color = Color.Gray
                )
            }
            Spacer(Modifier.height(4.dp))
            ChatBubble {
                ChatText(text)
            }
        }
    }

}

@Preview
@Composable
fun PreviewChatItem() {
    ChatItem(
        authorName = "Ali Conors",
        authorImageUrl = "https://www.tvovermind.com/wp-content/uploads/2018/01/Goku.jpg",
        dateSent = "3:30 PM",
        text = "Yeah I've been mainly referring to Compose Sample 👍🏻"
    )
}