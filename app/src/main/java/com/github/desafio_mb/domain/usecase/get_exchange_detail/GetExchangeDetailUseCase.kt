package com.github.desafio_mb.domain.usecase.get_exchange_detail

import com.github.desafio_mb.commom.Resource
import com.github.desafio_mb.domain.model.Exchange
import com.github.desafio_mb.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetExchangeDetailUseCase(private val repository: Repository) {

    operator fun invoke(id: String): Flow<Resource<Exchange>> = flow {
        emit(Resource.Loading())
        val result = try {
            val data = repository.getExchangeDetail(id)
            Resource.Success(data)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage.toString())
        }
        emit(result)
    }

}