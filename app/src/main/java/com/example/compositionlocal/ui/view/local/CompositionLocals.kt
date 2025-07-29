package com.example.compositionlocal.ui.view.local

import androidx.compose.runtime.compositionLocalOf
import com.example.compositionlocal.ui.view.model.User

val LocalUserName = compositionLocalOf { "UserName" }
val LocalUser = compositionLocalOf<User> {
    User("최대리", 30)
}