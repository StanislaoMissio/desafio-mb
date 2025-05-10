package com.github.desafio_mb.di

import com.github.desafio_mb.BuildConfig
import com.github.desafio_mb.data.repository.RepositoryImpl
import com.github.desafio_mb.domain.repository.Repository
import com.github.desafio_mb.domain.usecase.get_exchange_list.GetExchangeListUseCase
import com.github.desafio_mb.presentation.screens.exchange.ExchangeListViewModel
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single { provideRetrofit(okHttpClient = get()) }
    factory { getApi(retrofit = get()) }
    factory { getOkHttpClient() }
}

val repositoryModule = module {
    single<Repository> { RepositoryImpl(api = get()) }
}

val useCaseModule = module {
    factory<GetExchangeListUseCase> { GetExchangeListUseCase(repository = get()) }
}

val viewModelModule = module {
    viewModel { ExchangeListViewModel(getExchangeListUseCase = get()) }
}

private fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
    Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

private fun getOkHttpClient(): OkHttpClient {
    val interceptor = HttpLoggingInterceptor()
    val headerInterceptor = Interceptor { chain ->
        val request = chain.request()
            .newBuilder()
            .addHeader("X-CoinAPI-Key", BuildConfig.API_KEY)
            .build()
        chain.proceed(request)
    }
    interceptor.level = Level.BODY
    return OkHttpClient()
        .newBuilder()
        .addInterceptor(interceptor)
        .addInterceptor(headerInterceptor)
        .build()
}

private fun getApi(retrofit: Retrofit): API = retrofit.create(API::class.java)