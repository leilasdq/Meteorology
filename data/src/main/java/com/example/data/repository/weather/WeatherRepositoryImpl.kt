package com.example.data.repository.weather

import com.example.common.GetResult
import com.example.data.remote.service.GetWeatherService
import com.example.domain.model.Weather
import com.example.domain.usecases.GetWeatherRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

class WeatherRepositoryImpl(
    private val service: GetWeatherService
) : GetWeatherRepository {
    override fun getCurrentWeather(
        lat: Float,
        lon: Float,
        appid: String,
        lang: String,
    ): Flow<GetResult<Weather>> = flow {
        emit(GetResult.Loading)
        val networkData = service.getWeather(lat, lon, appid, lang)
        emit(GetResult.Success(networkData.toDomain()))
    }.catch { e ->
        emit(GetResult.Error(throwable = e))
    }
}