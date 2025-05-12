package com.github.desafio_mb.presentation.screens.exchange

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.github.desafio_mb.presentation.Screen
import com.github.desafio_mb.presentation.screens.exchange.components.ExchangeListItem
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ExchangeListScreen(
    navController: NavController,
    viewModel: ExchangeListViewModel = koinViewModel()
) {
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.exchangeLists) { exchange ->
                ExchangeListItem(exchange) {
                    navController.navigate(Screen.ExchangeDetailScreen.route + "/${exchange.exchangeId}")
                }
            }
        }
        if (state.error.isNotBlank()) {
            Text(text = state.error)
        }
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}