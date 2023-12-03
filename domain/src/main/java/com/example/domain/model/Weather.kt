package com.example.domain.model

data class Weather(
    val weatherObject: WeatherObject,
    val main: WeatherMainItem,
    val visibility: Float,
    val windData: WindData,

)

data class WeatherObject(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String,
)

data class WeatherMainItem(
    val temp: Float,
    val feelsLike: Float,
    val tempMin: Float,
    val tempMax: Float,
    val pressure: Float,
    val seaLevel: Float,
    val humidity: Float,
    val grandLevel: Float,
)

data class WindData(
    val speed: Float,
    val deg: Float,
    val gust: Float,
)
