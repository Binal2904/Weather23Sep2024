package com.demo.advanced.daggerhilt.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse
import com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse
import com.demo.advanced.daggerhilt.preference.SharedPreferenceManager
import com.demo.advanced.daggerhilt.repository.MainRepository
import com.demo.advanced.daggerhilt.util.ApiResource
import com.demo.advanced.daggerhilt.util.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper,
    private val pref: SharedPreferenceManager
) :
    ViewModel() {

    private val mCurrentMutableWeatherData = MutableLiveData<ApiResource<CurrentWeatherResponse>>()
    val mCurrentWeatherData: LiveData<ApiResource<CurrentWeatherResponse>> get() = mCurrentMutableWeatherData

    private val mMutable5DayForecast = MutableLiveData<ApiResource<LastDaysForeCastResponse>>()
    val m5DayForeCast: LiveData<ApiResource<LastDaysForeCastResponse>> get() = mMutable5DayForecast

    fun getCurrentWeatherInfoSearchByCity() {
        viewModelScope.launch {
            mCurrentMutableWeatherData.postValue(ApiResource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getCurrentWeatherInfo(pref.getLatitude(), pref.getLongitude()).let {
                    if (it.isSuccessful) {
                        mCurrentMutableWeatherData.postValue(ApiResource.success(it.body()))
                    } else
                        mCurrentMutableWeatherData.postValue(
                            ApiResource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                }
            } else {
                mCurrentMutableWeatherData.postValue(
                    ApiResource.error(
                        "No Active Internet Connection",
                        null
                    )
                )
            }
        }
    }

    fun getCurrentWeatherInfoSearchByCity(city: String) {
        viewModelScope.launch {
            mCurrentMutableWeatherData.postValue(ApiResource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.searchWeatherAccordingCity(city).let {
                    if (it.isSuccessful) {
                        mCurrentMutableWeatherData.postValue(ApiResource.success(it.body()))
                    } else
                        mCurrentMutableWeatherData.postValue(
                            ApiResource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                }
            } else {
                mCurrentMutableWeatherData.postValue(
                    ApiResource.error(
                        "No Active Internet Connection",
                        null
                    )
                )
            }
        }
    }

    fun get5DaysForeCast(city: String) {
        viewModelScope.launch {
            mMutable5DayForecast.postValue(ApiResource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.get5DaysForeCast(pref.getLatitude(), pref.getLongitude(),city).let {
                    if (it.isSuccessful) {
                        mMutable5DayForecast.postValue(ApiResource.success(it.body()))
                    } else
                        mMutable5DayForecast.postValue(
                            ApiResource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                }
            } else {
                mMutable5DayForecast.postValue(
                    ApiResource.error(
                        "No Active Internet Connection",
                        null
                    )
                )
            }
        }
    }
}