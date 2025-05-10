package com.github.desafio_mb

import android.app.Application
import com.github.desafio_mb.di.networkModule
import com.github.desafio_mb.di.repositoryModule
import com.github.desafio_mb.di.useCaseModule
import com.github.desafio_mb.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MBApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MBApplication)
            modules(networkModule, repositoryModule, viewModelModule, useCaseModule)
        }
    }
}