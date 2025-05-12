package com.github.desafio_mb.domain.repository

import com.github.desafio_mb.domain.model.ExchangeList

interface Repository {

    suspend fun getExchangeList(): List<ExchangeList>

    suspend fun getExchangeDetail(): ExchangeList

}