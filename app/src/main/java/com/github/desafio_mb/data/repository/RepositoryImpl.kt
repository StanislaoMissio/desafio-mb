package com.github.desafio_mb.data.repository

import com.github.desafio_mb.di.API
import com.github.desafio_mb.domain.model.ExchangeList
import com.github.desafio_mb.domain.repository.Repository

class RepositoryImpl(val api: API) : Repository {

    override suspend fun getExchangeList(): List<ExchangeList> = api.getExchange()

    override suspend fun getExchangeDetail(): ExchangeList = api.getExchangeDetail()

}