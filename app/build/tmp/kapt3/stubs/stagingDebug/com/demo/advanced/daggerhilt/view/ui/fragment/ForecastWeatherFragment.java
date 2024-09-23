package com.demo.advanced.daggerhilt.view.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/fragment/ForecastWeatherFragment;", "Lcom/demo/advanced/daggerhilt/view/base/BaseFragment;", "Lcom/demo/advanced/daggerhilt/databinding/FragmentForecastWeatherBinding;", "()V", "forecastAdapter", "Lcom/demo/advanced/daggerhilt/view/ui/adapter/ForecastAdapter;", "getForecastAdapter", "()Lcom/demo/advanced/daggerhilt/view/ui/adapter/ForecastAdapter;", "setForecastAdapter", "(Lcom/demo/advanced/daggerhilt/view/ui/adapter/ForecastAdapter;)V", "mainViewModel", "Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "initializeRecyclerView", "", "itemClicked", "item", "Lcom/demo/advanced/daggerhilt/data/response/weather/ListEntries;", "mInitView", "view", "Landroid/view/View;", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setLiveDataListeners", "app_stagingDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ForecastWeatherFragment extends com.demo.advanced.daggerhilt.view.base.BaseFragment<com.demo.advanced.daggerhilt.databinding.FragmentForecastWeatherBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    public com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter forecastAdapter;
    
    public ForecastWeatherFragment() {
        super();
    }
    
    private final com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter getForecastAdapter() {
        return null;
    }
    
    public final void setForecastAdapter(@org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.demo.advanced.daggerhilt.databinding.FragmentForecastWeatherBinding setBinding(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override
    protected void mInitView(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final void setLiveDataListeners() {
    }
    
    private final void initializeRecyclerView() {
    }
    
    private final void itemClicked(com.demo.advanced.daggerhilt.data.response.weather.ListEntries item) {
    }
}