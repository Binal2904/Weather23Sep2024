package com.demo.advanced.daggerhilt.repository

import com.demo.advanced.daggerhilt.BuildConfig
import com.demo.advanced.daggerhilt.restfullapi.ApiService

class MainRepository(private val apiHelper: ApiService) {
    suspend fun getCurrentWeatherInfo(
        lat: Double,
        long: Double,
    ) = apiHelper.getCurrentWeatherInfo(lat, long, BuildConfig.WEATHER_KEY)

    suspend fun searchWeatherAccordingCity(
        city: String,
    ) = apiHelper.searchWeatherAccordingCity(city, BuildConfig.WEATHER_KEY)


    suspend fun get5DaysForeCast(
        lat: Double,
        long: Double,
        city: String,
    ) = apiHelper.get5DaysForeCast(lat, long,city, BuildConfig.WEATHER_KEY)
}