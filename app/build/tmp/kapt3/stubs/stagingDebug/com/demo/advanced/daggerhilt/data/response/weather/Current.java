package com.demo.advanced.daggerhilt.data.response.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u00a7\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020=H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019\u00a8\u0006>"}, d2 = {"Lcom/demo/advanced/daggerhilt/data/response/weather/Current;", "", "sunrise", "", "temp", "", "visibility", "uvi", "pressure", "clouds", "feelsLike", "windGust", "dt", "windDeg", "dewPoint", "sunset", "weather", "", "Lcom/demo/advanced/daggerhilt/data/response/weather/WeatherItem;", "humidity", "windSpeed", "(IDIDIIDDIIDILjava/util/List;ID)V", "getClouds", "()I", "getDewPoint", "()D", "getDt", "getFeelsLike", "getHumidity", "getPressure", "getSunrise", "getSunset", "getTemp", "getUvi", "getVisibility", "getWeather", "()Ljava/util/List;", "getWindDeg", "getWindGust", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_stagingDebug"})
public final class Current {
    private final int sunrise = 0;
    private final double temp = 0.0;
    private final int visibility = 0;
    private final double uvi = 0.0;
    private final int pressure = 0;
    private final int clouds = 0;
    private final double feelsLike = 0.0;
    private final double windGust = 0.0;
    private final int dt = 0;
    private final int windDeg = 0;
    private final double dewPoint = 0.0;
    private final int sunset = 0;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> weather = null;
    private final int humidity = 0;
    private final double windSpeed = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.Current copy(int sunrise, double temp, int visibility, double uvi, int pressure, int clouds, double feelsLike, double windGust, int dt, int windDeg, double dewPoint, int sunset, @org.jetbrains.annotations.Nullable
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> weather, int humidity, double windSpeed) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Current(int sunrise, double temp, int visibility, double uvi, int pressure, int clouds, double feelsLike, double windGust, int dt, int windDeg, double dewPoint, int sunset, @org.jetbrains.annotations.Nullable
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> weather, int humidity, double windSpeed) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getSunrise() {
        return 0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getUvi() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getClouds() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getFeelsLike() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getWindGust() {
        return 0.0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getWindDeg() {
        return 0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double getDewPoint() {
        return 0.0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getSunset() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> getWeather() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double getWindSpeed() {
        return 0.0;
    }
}