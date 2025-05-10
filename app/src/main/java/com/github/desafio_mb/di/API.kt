package com.github.desafio_mb.di

import com.github.desafio_mb.commom.Resource
import com.github.desafio_mb.domain.model.Exchange
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Header

interface API {

    @GET("v1/exchanges")
    suspend fun getExchange(): List<Exchange>

    @GET("v1/exchanges")
    suspend fun getExchangeDetail(): Exchange

}