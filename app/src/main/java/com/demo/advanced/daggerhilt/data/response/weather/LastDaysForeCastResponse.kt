package com.demo.advanced.daggerhilt.data.response.weather

import com.demo.advanced.daggerhilt.util.TimeFormatter.Companion.formatTo
import com.demo.advanced.daggerhilt.util.TimeFormatter.Companion.toDate
import com.demo.advanced.daggerhilt.util.toCelsius
import kotlin.math.roundToInt

data class LastDaysForeCastResponse(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<ListEntries>,
    val message: Int
)

data class ListEntries(
    val clouds: Clouds,
    val dt: Int,
    val dt_txt: String,
    val main: Main,
    val pop: Double? = 0.0,
    val sys: Sys,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
){
    val dateTime: String
        get() = dt_txt.toDate().formatTo("dd/MM/yyy HH:mm")
}


data class Clouds(
    val all: Int
)

data class Main(
    val feels_like: Double,
    val grnd_level: Int,
    val humidity: Int,
    val pressure: Int,
    val sea_level: Int,
    val temp: Double,
    val temp_kf: Double,
    val temp_max: Double,
    val temp_min: Double
){
    val tempInCelsius: String
    get() = temp?.toCelsius()?.roundToInt().toString()

}

data class Sys(
    val pod: String
)

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
){
    val iconUrl: String
        get() = "https://openweathermap.org/img/wn/$icon@2x.png"
}

data class Wind(
    val deg: Int,
    val gust: Double,
    val speed: Double
)

data class Coord(
    val lat: Double,
    val lon: Double
)

data class City(
    val coord: Coord,
    val country: String,
    val id: Int,
    val name: String,
    val population: Int,
    val sunrise: Int,
    val sunset: Int,
    val timezone: Int
)