package com.demo.advanced.daggerhilt.view.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.demo.advanced.daggerhilt.view.ui.fragment.SearchWeatherFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 1
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return SearchWeatherFragment()
        }
        return SearchWeatherFragment()
    }
}