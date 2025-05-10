package com.github.desafio_mb.presentation.screens.exchange

import com.github.desafio_mb.domain.model.Exchange

data class ExchangeListState(
    val isLoading: Boolean = false,
    val exchanges: List<Exchange> = emptyList(),
    val error: String = ""
)