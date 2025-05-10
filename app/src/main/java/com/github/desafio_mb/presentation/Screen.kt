package com.github.desafio_mb.presentation

sealed class Screen(val route: String) {

    object ExchangeListScreen : Screen("exchange_list_screen")
    object ExchangeDetailScreen : Screen("exchange_detail_screen")

}