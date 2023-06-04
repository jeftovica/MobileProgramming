package com.example.raftingbuddy.model

import androidx.annotation.StringRes

data class Topic(
    @StringRes val userName: Int,
    @StringRes val riverName: Int,
    val numberOfBuddies: Int,
    @StringRes val date: Int,
    val comment: String?,
    val buttonText: String = "Send message"
)
