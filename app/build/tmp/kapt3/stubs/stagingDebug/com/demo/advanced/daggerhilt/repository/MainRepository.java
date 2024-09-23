package com.demo.advanced.daggerhilt.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/demo/advanced/daggerhilt/repository/MainRepository;", "", "apiHelper", "Lcom/demo/advanced/daggerhilt/restfullapi/ApiService;", "(Lcom/demo/advanced/daggerhilt/restfullapi/ApiService;)V", "get5DaysForeCast", "Lretrofit2/Response;", "Lcom/demo/advanced/daggerhilt/data/response/weather/LastDaysForeCastResponse;", "lat", "", "long", "city", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentWeatherInfo", "Lcom/demo/advanced/daggerhilt/data/response/weather/CurrentWeatherResponse;", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchWeatherAccordingCity", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stagingDebug"})
public final class MainRepository {
    private final com.demo.advanced.daggerhilt.restfullapi.ApiService apiHelper = null;
    
    public MainRepository(@org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.restfullapi.ApiService apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCurrentWeatherInfo(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchWeatherAccordingCity(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object get5DaysForeCast(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse>> continuation) {
        return null;
    }
}