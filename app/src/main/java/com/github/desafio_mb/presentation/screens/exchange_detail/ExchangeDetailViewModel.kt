package com.github.desafio_mb.presentation.screens.exchange_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.desafio_mb.commom.Resource
import com.github.desafio_mb.domain.usecase.get_exchange_detail.GetExchangeDetailUseCase
import kotlinx.coroutines.launch

class ExchangeDetailViewModel(private val useCase: GetExchangeDetailUseCase) : ViewModel() {

    private val _state = mutableStateOf(ExchangeDetailState())
    val state: State<ExchangeDetailState> = _state

    init {
        getExchangeDetail("")
    }

    private fun getExchangeDetail(id: String) {
        viewModelScope.launch {
            useCase(id).collect { result ->
                when (result) {
                    is Resource.Success -> {
                        _state.value = ExchangeDetailState(exchange = result.data!!)
                    }

                    is Resource.Error -> {
                        _state.value =
                            ExchangeDetailState(error = result.message ?: "Error inesperado")
                    }

                    is Resource.Loading -> {
                        _state.value = ExchangeDetailState(isLoading = true)
                    }
                }
            }
        }
    }
}