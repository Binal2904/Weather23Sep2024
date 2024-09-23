package com.demo.advanced.daggerhilt.restfullapi

import com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse
import com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    suspend fun getCurrentWeatherInfo(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("APPID") appid: String,
    ): Response<CurrentWeatherResponse>

    @GET("weather")
    suspend fun searchWeatherAccordingCity(
        @Query("q") city: String,
        @Query("APPID") appid: String,
    ): Response<CurrentWeatherResponse>

    @GET("forecast")
    suspend fun get5DaysForeCast(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("q") city: String,
        @Query("APPID") appid: String,
    ): Response<LastDaysForeCastResponse>
}