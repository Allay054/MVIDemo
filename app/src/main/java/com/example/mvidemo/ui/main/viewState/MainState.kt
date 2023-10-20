package com.example.mvidemo.ui.main.viewState

import com.example.mvidemo.data.model.User


sealed class MainState {

    data object Idle : MainState()
    data object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()

}