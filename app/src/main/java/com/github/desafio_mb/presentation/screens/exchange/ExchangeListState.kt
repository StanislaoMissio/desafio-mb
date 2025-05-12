package com.github.desafio_mb.presentation.screens.exchange

import com.github.desafio_mb.domain.model.ExchangeList

data class ExchangeListState(
    val isLoading: Boolean = false,
    val exchangeLists: List<ExchangeList> = emptyList(),
    val error: String = ""
)