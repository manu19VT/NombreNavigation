package com.example.nombresnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.nombresnavigation.navigation.AppNavigation
import com.example.nombresnavigation.ui.theme.NombresNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NombresNavigationTheme {
                AppNavigation()
            }
        }
    }
}