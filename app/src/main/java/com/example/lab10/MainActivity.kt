package com.example.lab10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.lab10.ui.theme.Lab10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab10Theme { // Usa tu tema si es necesario
                Surface(color = MaterialTheme.colorScheme.background) {
                    SeriesApp() // Aquí llamas a SeriesApp
                }
            }
        }
    }
}
