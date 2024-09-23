package com.demo.advanced.daggerhilt.view.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/demo/advanced/daggerhilt/repository/MainRepository;", "networkHelper", "Lcom/demo/advanced/daggerhilt/util/NetworkHelper;", "pref", "Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;", "(Lcom/demo/advanced/daggerhilt/repository/MainRepository;Lcom/demo/advanced/daggerhilt/util/NetworkHelper;Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;)V", "m5DayForeCast", "Landroidx/lifecycle/LiveData;", "Lcom/demo/advanced/daggerhilt/util/ApiResource;", "Lcom/demo/advanced/daggerhilt/data/response/weather/LastDaysForeCastResponse;", "getM5DayForeCast", "()Landroidx/lifecycle/LiveData;", "mCurrentMutableWeatherData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/demo/advanced/daggerhilt/data/response/weather/CurrentWeatherResponse;", "mCurrentWeatherData", "getMCurrentWeatherData", "mMutable5DayForecast", "get5DaysForeCast", "", "city", "", "getCurrentWeatherInfoSearchByCity", "app_stagingDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.demo.advanced.daggerhilt.repository.MainRepository mainRepository = null;
    private final com.demo.advanced.daggerhilt.util.NetworkHelper networkHelper = null;
    private final com.demo.advanced.daggerhilt.preference.SharedPreferenceManager pref = null;
    private final androidx.lifecycle.MutableLiveData<com.demo.advanced.daggerhilt.util.ApiResource<com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse>> mCurrentMutableWeatherData = null;
    private final androidx.lifecycle.MutableLiveData<com.demo.advanced.daggerhilt.util.ApiResource<com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse>> mMutable5DayForecast = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.repository.MainRepository mainRepository, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.util.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.preference.SharedPreferenceManager pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.demo.advanced.daggerhilt.util.ApiResource<com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse>> getMCurrentWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.demo.advanced.daggerhilt.util.ApiResource<com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse>> getM5DayForeCast() {
        return null;
    }
    
    public final void getCurrentWeatherInfoSearchByCity() {
    }
    
    public final void getCurrentWeatherInfoSearchByCity(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
    
    public final void get5DaysForeCast(@org.jetbrains.annotations.NotNull
    java.lang.String city) {
    }
}