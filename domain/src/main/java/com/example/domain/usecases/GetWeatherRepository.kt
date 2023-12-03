package com.example.domain.usecases

import com.example.common.GetResult
import com.example.domain.model.Weather
import kotlinx.coroutines.flow.Flow

interface GetWeatherRepository {

    fun getCurrentWeather(): Flow<GetResult<Weather>>
}