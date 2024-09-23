package com.demo.advanced.daggerhilt.view.ui.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import androidx.fragment.app.viewModels
import com.demo.advanced.daggerhilt.R
import com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse
import com.demo.advanced.daggerhilt.databinding.FragmentSearchTodayWeatherBinding
import com.demo.advanced.daggerhilt.enum.ApiStatus
import com.demo.advanced.daggerhilt.util.TimeFormatter.Companion.getCurrentDateTime
import com.demo.advanced.daggerhilt.util.TimeFormatter.Companion.toFormattedTime
import com.demo.advanced.daggerhilt.util.Utility.Companion.setGlideImage
import com.demo.advanced.daggerhilt.util.hide
import com.demo.advanced.daggerhilt.util.show
import com.demo.advanced.daggerhilt.view.base.BaseFragment
import com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

@AndroidEntryPoint
class SearchWeatherFragment : BaseFragment<FragmentSearchTodayWeatherBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun setBinding(
        inflater: LayoutInflater, container: ViewGroup?
    ): FragmentSearchTodayWeatherBinding {
        return FragmentSearchTodayWeatherBinding.inflate(inflater, container, false)

    }


    override fun mInitView(view: View) {
        initializeRecyclerView()
        setLiveDataListeners()
    }


    private fun setLiveDataListeners() {
        mainViewModel.getCurrentWeatherInfoSearchByCity()
        mainViewModel.mCurrentWeatherData.observe(viewLifecycleOwner) {
            when (it.status) {
                ApiStatus.SUCCESS -> {
                    it.data?.let { user ->
                        setWeatherInfo(user)
                    }
                }

                ApiStatus.LOADING -> {
                }

                ApiStatus.ERROR -> {
                }
            }
        }
    }

    private fun initializeRecyclerView() {
        binding.inputFindCityWeather.setOnEditorActionListener { view, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                mainViewModel.getCurrentWeatherInfoSearchByCity((view as EditText).text.toString())
            }
            false
        }
    }

    private fun setWeatherInfo(weatherData: CurrentWeatherResponse) {
        binding.apply {
            constraintLayoutShowingTemp.show()
            inputFindCityWeather.text?.clear()

            weatherData.let { weatherDetail ->
                val iconCode = weatherDetail.weather[0].icon.replace("n", "d")

                setGlideImage(
                    binding.ivWeatherImage,
                    "http://openweathermap.org/img/wn/" + "${iconCode}@4x.png"
                )
                changeBgAccToTemp(iconCode)
                tvTodaysDate.text = getCurrentDateTime("E, d MMM yyyy")
                tvTemperature.text = weatherDetail.main.temp.toString()
                tvCityName.text = "${weatherDetail.name.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(
                        Locale.getDefault()
                    ) else it.toString()
                }}"

                binding.layoutWeatherAdditional.tvHumidityValue.text =
                    weatherData.main.humidity.toString()
                binding.layoutWeatherAdditional.tvPressureValue.text =
                    weatherData.main.pressure.toString()
                binding.layoutWeatherAdditional.tvVisibilityValue.text =
                    weatherData.visibility.toString()

                binding.layoutSunsetSunrise.tvSunriseTime.text =
                    weatherData.sys.sunrise.toFormattedTime()
                binding.layoutSunsetSunrise.tvSunsetTime.text =
                    weatherData.sys.sunset.toFormattedTime()
            }
        }

    }

    private fun changeBgAccToTemp(iconCode: String?) {
        when (iconCode) {
            "01d", "02d", "03d" -> binding.ivWeatherHumanReaction.setImageResource(R.drawable.sunny_day)
            "04d", "09d", "10d", "11d" -> binding.ivWeatherHumanReaction.setImageResource(R.drawable.raining)
            "13d", "50d" -> binding.ivWeatherHumanReaction.setImageResource(R.drawable.snowfalling)
        }
    }

}