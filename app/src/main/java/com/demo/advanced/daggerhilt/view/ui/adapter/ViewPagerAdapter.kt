package com.demo.advanced.daggerhilt.view.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.demo.advanced.daggerhilt.view.ui.fragment.ForecastWeatherFragment
import com.demo.advanced.daggerhilt.view.ui.fragment.SearchWeatherFragment

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    tabTitles: List<String>
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return SearchWeatherFragment()
            1 -> return ForecastWeatherFragment()
        }
        return SearchWeatherFragment()
    }
}