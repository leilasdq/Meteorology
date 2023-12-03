package com.example.domain.usecases

class GetCurrentWeatherStateUseCase(
    private val repo: GetWeatherRepository
) {

    operator fun invoke() = repo.getCurrentWeather()
}