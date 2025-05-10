package com.github.desafio_mb.presentation.screens.exchange

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.desafio_mb.commom.Resource
import com.github.desafio_mb.domain.usecase.get_exchange_list.GetExchangeListUseCase
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class ExchangeListViewModel(private val getExchangeListUseCase: GetExchangeListUseCase) :
    ViewModel() {

    private val _state = mutableStateOf(ExchangeListState())
    val state: State<ExchangeListState> = _state

    init {
        getList()
    }

    private fun getList() {
        getExchangeListUseCase().onEach { result ->
            when (result) {
                is Resource.Loading -> _state.value = ExchangeListState(isLoading = true)
                is Resource.Success ->
                    _state.value = ExchangeListState(exchanges = result.data ?: emptyList())

                is Resource.Error ->
                    _state.value = ExchangeListState(error = "An unexpected error occured")
            }
        }.launchIn(viewModelScope)
    }

}