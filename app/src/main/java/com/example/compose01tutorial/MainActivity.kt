package com.example.compose01tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose01tutorial.data.Message

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

@Composable
fun MessageCard(msg: Message) {
    Text(text = msg.author)
    Text(text = msg.body)
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
    )
}