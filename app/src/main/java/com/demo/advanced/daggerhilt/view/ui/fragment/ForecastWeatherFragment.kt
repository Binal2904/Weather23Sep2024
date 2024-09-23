package com.demo.advanced.daggerhilt.view.ui.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import com.demo.advanced.daggerhilt.R
import com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse
import com.demo.advanced.daggerhilt.data.response.weather.ListEntries
import com.demo.advanced.daggerhilt.databinding.FragmentForecastWeatherBinding
import com.demo.advanced.daggerhilt.databinding.FragmentSearchTodayWeatherBinding
import com.demo.advanced.daggerhilt.enum.ApiStatus
import com.demo.advanced.daggerhilt.util.TimeFormatter.Companion.getCurrentDateTime
import com.demo.advanced.daggerhilt.util.TimeFormatter.Companion.toFormattedTime
import com.demo.advanced.daggerhilt.util.Utility.Companion.setGlideImage
import com.demo.advanced.daggerhilt.util.hide
import com.demo.advanced.daggerhilt.util.show
import com.demo.advanced.daggerhilt.view.base.BaseFragment
import com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter
import com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

@AndroidEntryPoint
class ForecastWeatherFragment : BaseFragment<FragmentForecastWeatherBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    lateinit var forecastAdapter : ForecastAdapter
    override fun setBinding(
        inflater: LayoutInflater, container: ViewGroup?
    ): FragmentForecastWeatherBinding {
        return FragmentForecastWeatherBinding.inflate(inflater, container, false)

    }


    override fun mInitView(view: View) {
        binding.inputFindCityWeather.setOnEditorActionListener { view, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                mainViewModel.get5DaysForeCast((view as EditText).text.toString())
            }
            false
        }
        initializeRecyclerView()
        setLiveDataListeners()
    }


    private fun setLiveDataListeners() {
        mainViewModel.get5DaysForeCast("")
        mainViewModel.m5DayForeCast.observe(viewLifecycleOwner) {
            when (it.status) {
                ApiStatus.SUCCESS -> {
                    it.data?.let { user ->
                        binding.apply {
                            tvCityName.text = user.city.name
                        }
                        forecastAdapter.setData(it.data?.list?.toMutableList())
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
        binding.rvForecastWeather.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)

        forecastAdapter = ForecastAdapter(mutableListOf())
        binding.rvForecastWeather.adapter = forecastAdapter

    }
    private fun itemClicked(item: ListEntries) {
//        context?.toast(item.weather[0].description)
    }


}