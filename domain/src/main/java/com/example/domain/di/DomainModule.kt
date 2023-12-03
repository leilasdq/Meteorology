package com.example.domain.di

import com.example.domain.usecases.GetCurrentWeatherStateUseCase
import org.koin.dsl.module

val domainModule = module {
    single {
        GetCurrentWeatherStateUseCase(repo = get())
    }
}