package com.demo.advanced.daggerhilt.data.response.weather;

import java.lang.System;

/**
 * this class will be used in UI to show weather data
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003Jm\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u000203H\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011\u00a8\u00065"}, d2 = {"Lcom/demo/advanced/daggerhilt/data/response/weather/WeatherData;", "", "dateTime", "", "temperature", "cityAndCountry", "weatherConditionIconUrl", "weatherConditionIconDescription", "humidity", "pressure", "visibility", "sunrise", "sunset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCityAndCountry", "()Ljava/lang/String;", "setCityAndCountry", "(Ljava/lang/String;)V", "getDateTime", "setDateTime", "getHumidity", "setHumidity", "getPressure", "setPressure", "getSunrise", "setSunrise", "getSunset", "setSunset", "getTemperature", "setTemperature", "getVisibility", "setVisibility", "getWeatherConditionIconDescription", "setWeatherConditionIconDescription", "getWeatherConditionIconUrl", "setWeatherConditionIconUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_stagingDebug"})
public final class WeatherData {
    @org.jetbrains.annotations.NotNull
    private java.lang.String dateTime;
    @org.jetbrains.annotations.NotNull
    private java.lang.String temperature;
    @org.jetbrains.annotations.NotNull
    private java.lang.String cityAndCountry;
    @org.jetbrains.annotations.NotNull
    private java.lang.String weatherConditionIconUrl;
    @org.jetbrains.annotations.NotNull
    private java.lang.String weatherConditionIconDescription;
    @org.jetbrains.annotations.NotNull
    private java.lang.String humidity;
    @org.jetbrains.annotations.NotNull
    private java.lang.String pressure;
    @org.jetbrains.annotations.NotNull
    private java.lang.String visibility;
    @org.jetbrains.annotations.NotNull
    private java.lang.String sunrise;
    @org.jetbrains.annotations.NotNull
    private java.lang.String sunset;
    
    /**
     * this class will be used in UI to show weather data
     */
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.WeatherData copy(@org.jetbrains.annotations.NotNull
    java.lang.String dateTime, @org.jetbrains.annotations.NotNull
    java.lang.String temperature, @org.jetbrains.annotations.NotNull
    java.lang.String cityAndCountry, @org.jetbrains.annotations.NotNull
    java.lang.String weatherConditionIconUrl, @org.jetbrains.annotations.NotNull
    java.lang.String weatherConditionIconDescription, @org.jetbrains.annotations.NotNull
    java.lang.String humidity, @org.jetbrains.annotations.NotNull
    java.lang.String pressure, @org.jetbrains.annotations.NotNull
    java.lang.String visibility, @org.jetbrains.annotations.NotNull
    java.lang.String sunrise, @org.jetbrains.annotations.NotNull
    java.lang.String sunset) {
        return null;
    }
    
    /**
     * this class will be used in UI to show weather data
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * this class will be used in UI to show weather data
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * this class will be used in UI to show weather data
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherData() {
        super();
    }
    
    public WeatherData(@org.jetbrains.annotations.NotNull
    java.lang.String dateTime, @org.jetbrains.annotations.NotNull
    java.lang.String temperature, @org.jetbrains.annotations.NotNull
    java.lang.String cityAndCountry, @org.jetbrains.annotations.NotNull
    java.lang.String weatherConditionIconUrl, @org.jetbrains.annotations.NotNull
    java.lang.String weatherConditionIconDescription, @org.jetbrains.annotations.NotNull
    java.lang.String humidity, @org.jetbrains.annotations.NotNull
    java.lang.String pressure, @org.jetbrains.annotations.NotNull
    java.lang.String visibility, @org.jetbrains.annotations.NotNull
    java.lang.String sunrise, @org.jetbrains.annotations.NotNull
    java.lang.String sunset) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDateTime() {
        return null;
    }
    
    public final void setDateTime(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTemperature() {
        return null;
    }
    
    public final void setTemperature(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCityAndCountry() {
        return null;
    }
    
    public final void setCityAndCountry(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWeatherConditionIconUrl() {
        return null;
    }
    
    public final void setWeatherConditionIconUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWeatherConditionIconDescription() {
        return null;
    }
    
    public final void setWeatherConditionIconDescription(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHumidity() {
        return null;
    }
    
    public final void setHumidity(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPressure() {
        return null;
    }
    
    public final void setPressure(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVisibility() {
        return null;
    }
    
    public final void setVisibility(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSunrise() {
        return null;
    }
    
    public final void setSunrise(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSunset() {
        return null;
    }
    
    public final void setSunset(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}