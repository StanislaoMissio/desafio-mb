package com.github.desafio_mb.presentation.screens.exchange_detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel

@Composable
fun ExchangeDetailScreen(
    navController: NavController,
    viewModel: ExchangeDetailViewModel = koinViewModel()
) {
    val state = viewModel.state.value
    Box {
        Column {
            Text(text = "Exchange Detail Screen")

        }
    }

}