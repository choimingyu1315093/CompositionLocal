package com.example.compositionlocal.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.compositionlocal.ui.view.local.LocalUser
import com.example.compositionlocal.ui.view.local.LocalUserName

@Composable
fun SixComposable(){
    val userName = LocalUserName.current
    val user = LocalUser.current

    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = user.name,
            modifier = Modifier.background(Color.Red).padding(30.dp)
        )
    }
}