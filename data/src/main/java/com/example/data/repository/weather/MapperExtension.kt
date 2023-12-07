package com.example.data.repository.weather

import com.example.data.remote.dto.WeatherDto
import com.example.data.remote.dto.WeatherMainItemDto
import com.example.data.remote.dto.WeatherObjectDto
import com.example.data.remote.dto.WindDataDto
import com.example.domain.model.Weather
import com.example.domain.model.WeatherMainItem
import com.example.domain.model.WeatherObject
import com.example.domain.model.WindData

fun WeatherDto.toDomain() = Weather(
    weatherObject.map { it.toDomain() },
    main.toDomain(),
    visibility,
    windData.toDomain()
)

fun WeatherObjectDto.toDomain() = WeatherObject(
    id, main, description, icon
)

fun WeatherMainItemDto.toDomain() = WeatherMainItem(
    temp, feelsLike, tempMin, tempMax, pressure, seaLevel, humidity, grandLevel
)

fun WindDataDto.toDomain() = WindData(
    speed, deg, gust
)