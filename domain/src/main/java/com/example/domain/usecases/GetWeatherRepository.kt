package com.example.domain.usecases

import com.example.common.GetResult
import com.example.domain.model.Weather
import kotlinx.coroutines.flow.Flow

interface GetWeatherRepository {

    fun getCurrentWeather(
        lat: Float,
        lon: Float,
        appid: String,
        lang: String = "fa",
    ): Flow<GetResult<Weather>>
}