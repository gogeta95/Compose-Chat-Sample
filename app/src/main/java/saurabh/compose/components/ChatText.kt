package saurabh.compose.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import saurabh.compose.utils.getAnnotatedString

@Composable
fun ChatText(text: String) {
    val colors = MaterialTheme.colors
    val annotatedText = remember(text) { getAnnotatedString(colors, text) }

    Text(
        annotatedText,
        style = MaterialTheme.typography.body1,
        modifier = Modifier.padding(8.dp)
    )
}

@Preview
@Composable
fun PreviewChatText() {
    ChatText("*Yeah* I've ~been~ `mainly` _referring_ to @Compose Sample 👍🏻")
}