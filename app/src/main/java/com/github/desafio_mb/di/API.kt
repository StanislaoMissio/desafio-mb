package com.github.desafio_mb.di

import com.github.desafio_mb.commom.Resource
import com.github.desafio_mb.domain.model.Exchange
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface API {

    @GET("")
    suspend fun getExchange(): Flow<Resource<Exchange>>

}