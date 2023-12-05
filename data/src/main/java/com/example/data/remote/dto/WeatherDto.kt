package com.example.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("weather")
    val weatherObject: List<WeatherObjectDto>,
    @SerializedName("main")
    val main: WeatherMainItemDto,
    val visibility: Float,
    @SerializedName("wind")
    val windData: WindDataDto,

    )

data class WeatherObjectDto(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String,
)

data class WeatherMainItemDto(
    val temp: Float,
    @SerializedName("feels_like")
    val feelsLike: Float,
    @SerializedName("temp_min")
    val tempMin: Float,
    @SerializedName("temp_max")
    val tempMax: Float,
    @SerializedName("pressure ")
    val pressure: Float,
    @SerializedName("sea_level")
    val seaLevel: Float,
    @SerializedName("humidity")
    val humidity: Float,
    @SerializedName("grnd_level")
    val grandLevel: Float,
)

data class WindDataDto(
    val speed: Float,
    val deg: Float,
    val gust: Float,
)