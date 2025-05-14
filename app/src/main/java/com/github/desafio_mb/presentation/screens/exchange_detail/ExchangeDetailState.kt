package com.github.desafio_mb.presentation.screens.exchange_detail

import com.github.desafio_mb.domain.model.Exchange

data class ExchangeDetailState(
    val isLoading: Boolean = false,
    val exchange: Exchange = Exchange(),
    val error: String = ""
)