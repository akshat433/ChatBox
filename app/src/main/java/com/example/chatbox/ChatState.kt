package com.example.chatbox

import android.graphics.Bitmap
import com.example.chatbox.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
