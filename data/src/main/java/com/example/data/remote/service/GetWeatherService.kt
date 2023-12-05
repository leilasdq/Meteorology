package com.example.data.remote.service

import com.example.data.remote.dto.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

interface GetWeatherService {

    @GET("weather")
    suspend fun getWeather(
        @Query("lat") lat: Float,
        @Query("lon") lon: Float,
        @Query("appid") appid: String,
        @Query("lang") lang: String = "fa",
    ): WeatherDto
}