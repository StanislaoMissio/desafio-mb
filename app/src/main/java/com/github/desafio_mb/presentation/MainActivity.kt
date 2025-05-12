package com.github.desafio_mb.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.desafio_mb.presentation.screens.exchange.ExchangeListScreen
import com.github.desafio_mb.presentation.theme.DesafiombTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "exchange_list_screen",
                ) {
                    composable(
                        route = Screen.ExchangeListScreen.route
                    ) {
                        ExchangeListScreen(navController)
                    }
                    composable(
                        route = Screen.ExchangeDetailScreen.route
                    ) {

                    }
                }
            }
        }
    }
}