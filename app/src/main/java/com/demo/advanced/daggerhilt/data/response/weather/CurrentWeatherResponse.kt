package com.demo.advanced.daggerhilt.data.response.weather

data class CurrentWeatherResponse(
    val base: String,
    val clouds: CloudsX,
    val cod: Int,
    val coord: CoordX,
    val dt: Int,
    val id: Int,
    val main: MainX,
    val name: String,
    val sys: SysX,
    val timezone: Int,
    val visibility: Int,
    val weather: List<WeatherX>,
    val wind: WindX
)

data class CloudsX(
    val all: Int
)

data class CoordX(
    val lat: Double,
    val lon: Double
)

data class MainX(
    val feels_like: Double,
    val grnd_level: Int,
    val humidity: Int,
    val pressure: Int,
    val sea_level: Int,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)

data class SysX(
    val country: String,
    val id: Int,
    val sunrise: Long,
    val sunset: Long,
    val type: Int
)

data class WeatherX(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)
data class WindX(
    val deg: Int,
    val speed: Double
)