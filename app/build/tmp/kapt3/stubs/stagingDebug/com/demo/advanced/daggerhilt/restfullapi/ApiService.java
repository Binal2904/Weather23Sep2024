package com.demo.advanced.daggerhilt.restfullapi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/demo/advanced/daggerhilt/restfullapi/ApiService;", "", "get5DaysForeCast", "Lretrofit2/Response;", "Lcom/demo/advanced/daggerhilt/data/response/weather/LastDaysForeCastResponse;", "lat", "", "lon", "city", "", "appid", "(DDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeatherInfo", "Lcom/demo/advanced/daggerhilt/data/response/weather/CurrentWeatherResponse;", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchWeatherAccordingCity", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stagingDebug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "weather")
    public abstract java.lang.Object getCurrentWeatherInfo(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "APPID")
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "weather")
    public abstract java.lang.Object searchWeatherAccordingCity(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String city, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "APPID")
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "forecast")
    public abstract java.lang.Object get5DaysForeCast(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String city, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "APPID")
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse>> continuation);
}