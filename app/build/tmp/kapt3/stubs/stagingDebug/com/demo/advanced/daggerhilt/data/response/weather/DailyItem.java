package com.demo.advanced.daggerhilt.data.response.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00c5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\bH\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\u00cf\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\t\u0010L\u001a\u00020MH\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f\u00a8\u0006N"}, d2 = {"Lcom/demo/advanced/daggerhilt/data/response/weather/DailyItem;", "", "moonset", "", "rain", "", "sunrise", "temp", "Lcom/demo/advanced/daggerhilt/data/response/weather/Temp;", "moonPhase", "uvi", "moonrise", "pressure", "clouds", "feelsLike", "Lcom/demo/advanced/daggerhilt/data/response/weather/FeelsLike;", "windGust", "dt", "pop", "windDeg", "dewPoint", "sunset", "weather", "", "Lcom/demo/advanced/daggerhilt/data/response/weather/WeatherItem;", "humidity", "windSpeed", "(IDILcom/demo/advanced/daggerhilt/data/response/weather/Temp;DDIIILcom/demo/advanced/daggerhilt/data/response/weather/FeelsLike;DIDIDILjava/util/List;ID)V", "getClouds", "()I", "getDewPoint", "()D", "getDt", "getFeelsLike", "()Lcom/demo/advanced/daggerhilt/data/response/weather/FeelsLike;", "getHumidity", "getMoonPhase", "getMoonrise", "getMoonset", "getPop", "getPressure", "getRain", "getSunrise", "getSunset", "getTemp", "()Lcom/demo/advanced/daggerhilt/data/response/weather/Temp;", "getUvi", "getWeather", "()Ljava/util/List;", "getWindDeg", "getWindGust", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_stagingDebug"})
public final class DailyItem {
    private final int moonset = 0;
    private final double rain = 0.0;
    private final int sunrise = 0;
    @org.jetbrains.annotations.NotNull
    private final com.demo.advanced.daggerhilt.data.response.weather.Temp temp = null;
    private final double moonPhase = 0.0;
    private final double uvi = 0.0;
    private final int moonrise = 0;
    private final int pressure = 0;
    private final int clouds = 0;
    @org.jetbrains.annotations.NotNull
    private final com.demo.advanced.daggerhilt.data.response.weather.FeelsLike feelsLike = null;
    private final double windGust = 0.0;
    private final int dt = 0;
    private final double pop = 0.0;
    private final int windDeg = 0;
    private final double dewPoint = 0.0;
    private final int sunset = 0;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> weather = null;
    private final int humidity = 0;
    private final double windSpeed = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.DailyItem copy(int moonset, double rain, int sunrise, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.data.response.weather.Temp temp, double moonPhase, double uvi, int moonrise, int pressure, int clouds, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.data.response.weather.FeelsLike feelsLike, double windGust, int dt, double pop, int windDeg, double dewPoint, int sunset, @org.jetbrains.annotations.Nullable
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
    
    public DailyItem(int moonset, double rain, int sunrise, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.data.response.weather.Temp temp, double moonPhase, double uvi, int moonrise, int pressure, int clouds, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.data.response.weather.FeelsLike feelsLike, double windGust, int dt, double pop, int windDeg, double dewPoint, int sunset, @org.jetbrains.annotations.Nullable
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> weather, int humidity, double windSpeed) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getMoonset() {
        return 0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getRain() {
        return 0.0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getSunrise() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.Temp component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.Temp getTemp() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getMoonPhase() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getUvi() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getMoonrise() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getClouds() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.FeelsLike component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.FeelsLike getFeelsLike() {
        return null;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double getWindGust() {
        return 0.0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getPop() {
        return 0.0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getWindDeg() {
        return 0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double getDewPoint() {
        return 0.0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getSunset() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.WeatherItem> getWeather() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double getWindSpeed() {
        return 0.0;
    }
}