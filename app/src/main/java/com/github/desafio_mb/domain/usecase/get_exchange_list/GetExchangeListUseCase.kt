package com.github.desafio_mb.domain.usecase.get_exchange_list

import com.github.desafio_mb.commom.Resource
import com.github.desafio_mb.domain.model.ExchangeList
import com.github.desafio_mb.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetExchangeListUseCase(private val repository: Repository) {

    operator fun invoke(): Flow<Resource<List<ExchangeList>>> = flow {
        emit(Resource.Loading())
        val result = try {
            val data = repository.getExchangeList()
            Resource.Success(data)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage.toString())
        }
        emit(result)
    }
}