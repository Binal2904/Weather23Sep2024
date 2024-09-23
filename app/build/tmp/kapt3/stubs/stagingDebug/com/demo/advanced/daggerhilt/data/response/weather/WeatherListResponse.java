package com.demo.advanced.daggerhilt.data.response.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\u001d\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eH\u00c6\u0003J\t\u0010%\u001a\u00020\u0010H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003Jk\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\nH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006-"}, d2 = {"Lcom/demo/advanced/daggerhilt/data/response/weather/WeatherListResponse;", "", "timezone", "", "timezoneOffset", "", "daily", "", "Lcom/demo/advanced/daggerhilt/data/response/weather/DailyItem;", "lon", "", "hourly", "Ljava/util/ArrayList;", "Lcom/demo/advanced/daggerhilt/data/response/weather/HourlyItem;", "Lkotlin/collections/ArrayList;", "current", "Lcom/demo/advanced/daggerhilt/data/response/weather/Current;", "lat", "(Ljava/lang/String;ILjava/util/List;DLjava/util/ArrayList;Lcom/demo/advanced/daggerhilt/data/response/weather/Current;D)V", "getCurrent", "()Lcom/demo/advanced/daggerhilt/data/response/weather/Current;", "getDaily", "()Ljava/util/List;", "getHourly", "()Ljava/util/ArrayList;", "getLat", "()D", "getLon", "getTimezone", "()Ljava/lang/String;", "getTimezoneOffset", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_stagingDebug"})
public final class WeatherListResponse {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String timezone = null;
    private final int timezoneOffset = 0;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.DailyItem> daily = null;
    private final double lon = 0.0;
    @org.jetbrains.annotations.Nullable
    private final java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.weather.HourlyItem> hourly = null;
    @org.jetbrains.annotations.NotNull
    private final com.demo.advanced.daggerhilt.data.response.weather.Current current = null;
    private final double lat = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.WeatherListResponse copy(@org.jetbrains.annotations.NotNull
    java.lang.String timezone, int timezoneOffset, @org.jetbrains.annotations.Nullable
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.DailyItem> daily, double lon, @org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.weather.HourlyItem> hourly, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.data.response.weather.Current current, double lat) {
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
    
    public WeatherListResponse(@org.jetbrains.annotations.NotNull
    java.lang.String timezone, int timezoneOffset, @org.jetbrains.annotations.Nullable
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.DailyItem> daily, double lon, @org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.weather.HourlyItem> hourly, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.data.response.weather.Current current, double lat) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTimezoneOffset() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.DailyItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.demo.advanced.daggerhilt.data.response.weather.DailyItem> getDaily() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getLon() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.weather.HourlyItem> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.weather.HourlyItem> getHourly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.Current component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.data.response.weather.Current getCurrent() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getLat() {
        return 0.0;
    }
}