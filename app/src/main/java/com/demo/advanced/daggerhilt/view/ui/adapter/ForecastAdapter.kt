package com.demo.advanced.daggerhilt.view.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.demo.advanced.daggerhilt.BR
import com.demo.advanced.daggerhilt.R
import com.demo.advanced.daggerhilt.data.response.weather.LastDaysForeCastResponse
import com.demo.advanced.daggerhilt.data.response.weather.ListEntries

class ForecastAdapter(private var items: MutableList<ListEntries>) : RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.weather_list_item, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount() = items.size

    internal fun setData(forecast: MutableList<ListEntries>?) {
        // Assign the list to the RecyclerView. If data is null, assign an empty list to the adapter.
        this.items = forecast ?: mutableListOf()
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ListEntries) = with(binding.root) {
            binding.setVariable(BR.viewModel, item)
            binding.executePendingBindings()
        }
    }
}