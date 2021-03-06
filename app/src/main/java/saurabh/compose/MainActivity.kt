package saurabh.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import saurabh.compose.components.PreviewChatItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetChat()
        }
    }
}

@Composable
fun JetChat() {
    MaterialTheme {
        PreviewChatItem()
    }
}