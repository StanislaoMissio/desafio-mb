package com.github.desafio_mb.domain.repository

import com.github.desafio_mb.domain.model.Exchange

interface Repository {

    suspend fun getExchangeList(): List<Exchange>

    suspend fun getExchangeDetail(): Exchange

}