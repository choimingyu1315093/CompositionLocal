package com.example.compositionlocal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compositionlocal.ui.view.FirstComposable
import com.example.compositionlocal.ui.view.SixthComposable
import com.example.compositionlocal.ui.view.local.LocalUser
import com.example.compositionlocal.ui.view.local.LocalUserName
import com.example.compositionlocal.ui.view.model.User

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(
                LocalUserName provides "최대리",
                LocalUser provides User("김대리", 30)
            ) {
                Column (
                    modifier = Modifier
                        .width(300.dp)
                ){
                    FirstComposable()
                }
            }

            Column (
                modifier = Modifier
                    .width(300.dp)
            ){
                Spacer(modifier = Modifier.height(300.dp))
                SixthComposable()
            }
        }
    }
}