package com.github.desafio_mb.di

import com.github.desafio_mb.domain.model.ExchangeList
import retrofit2.http.GET

interface API {

    @GET("v1/exchanges")
    suspend fun getExchange(): List<ExchangeList>

    @GET("v1/exchanges")
    suspend fun getExchangeDetail(): ExchangeList

}