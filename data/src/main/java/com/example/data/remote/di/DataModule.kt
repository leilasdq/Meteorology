package com.example.data.remote.di

import com.example.data.remote.service.GetWeatherService
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
const val TimeOut = 500L

val dataModule = module {
    single {
        okhttp3.OkHttpClient.Builder()
            .connectTimeout(TimeOut, TimeUnit.SECONDS) // connect timeout
            .writeTimeout(TimeOut, TimeUnit.SECONDS) // write timeout
            .readTimeout(TimeOut, TimeUnit.SECONDS) // read timeout
            .apply {
                addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    }
                )
            }
            .build()
    }

    single {
        Retrofit.Builder().client(get())
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single {
        (get<Retrofit>()).create(GetWeatherService::class.java)
    }
}