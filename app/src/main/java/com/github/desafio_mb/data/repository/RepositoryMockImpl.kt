package com.github.desafio_mb.data.repository

import com.github.desafio_mb.di.Mock
import com.github.desafio_mb.domain.model.Exchange
import com.github.desafio_mb.domain.model.ExchangeList
import com.github.desafio_mb.domain.repository.Repository

class RepositoryMockImpl : Repository {

    override suspend fun getExchangeList(): List<ExchangeList> = Mock.mockExchange()

    override suspend fun getExchangeDetail(id: String): Exchange = Mock.mockExchangeById()

}