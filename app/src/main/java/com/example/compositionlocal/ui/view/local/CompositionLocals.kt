package com.example.compositionlocal.ui.view.local

import androidx.compose.runtime.compositionLocalOf
import com.example.compositionlocal.ui.view.model.User

val LocalUserName = compositionLocalOf { "LocalUserName" }
val LocalUser = compositionLocalOf<User> {
    User("dsfhgjkhadsjkfghsajkhjk", 30)
}