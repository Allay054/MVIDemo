package com.example.mvidemo.ui.main.intent

sealed class MainIntent {

    data object FetchUser : MainIntent()

}