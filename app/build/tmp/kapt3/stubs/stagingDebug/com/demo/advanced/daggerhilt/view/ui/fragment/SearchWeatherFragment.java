package com.demo.advanced.daggerhilt.view.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/fragment/SearchWeatherFragment;", "Lcom/demo/advanced/daggerhilt/view/base/BaseFragment;", "Lcom/demo/advanced/daggerhilt/databinding/FragmentSearchTodayWeatherBinding;", "()V", "mainViewModel", "Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "changeBgAccToTemp", "", "iconCode", "", "initializeRecyclerView", "mInitView", "view", "Landroid/view/View;", "setBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setLiveDataListeners", "setWeatherInfo", "weatherData", "Lcom/demo/advanced/daggerhilt/data/response/weather/CurrentWeatherResponse;", "app_stagingDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SearchWeatherFragment extends com.demo.advanced.daggerhilt.view.base.BaseFragment<com.demo.advanced.daggerhilt.databinding.FragmentSearchTodayWeatherBinding> {
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    public SearchWeatherFragment() {
        super();
    }
    
    private final com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.demo.advanced.daggerhilt.databinding.FragmentSearchTodayWeatherBinding setBinding(@org.jetbrains.annotations.NotNull
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
    
    private final void setWeatherInfo(com.demo.advanced.daggerhilt.data.response.weather.CurrentWeatherResponse weatherData) {
    }
    
    private final void changeBgAccToTemp(java.lang.String iconCode) {
    }
}