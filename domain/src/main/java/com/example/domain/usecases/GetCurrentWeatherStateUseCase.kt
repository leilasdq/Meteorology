package com.example.domain.usecases

class GetCurrentWeatherStateUseCase(
    private val repo: GetWeatherRepository
) {

    data class GetCurrentWeatherStateUseCaseArgs(
        val lat: Float,
        val lon: Float,
        val appid: String,
        val lang: String = "fa",
    )

    operator fun invoke(args: GetCurrentWeatherStateUseCaseArgs) = with(args) {
        repo.getCurrentWeather(lat, lon, appid, lang)
    }
}