package com.demo.advanced.daggerhilt.view.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001d\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000\u00a2\u0006\u0002\b\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/adapter/ForecastAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/demo/advanced/daggerhilt/view/ui/adapter/ForecastAdapter$ViewHolder;", "items", "", "Lcom/demo/advanced/daggerhilt/data/response/weather/ListEntries;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "forecast", "setData$app_stagingDebug", "ViewHolder", "app_stagingDebug"})
public final class ForecastAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter.ViewHolder> {
    private java.util.List<com.demo.advanced.daggerhilt.data.response.weather.ListEntries> items;
    
    public ForecastAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.ListEntries> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.view.ui.adapter.ForecastAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData$app_stagingDebug(@org.jetbrains.annotations.Nullable
    java.util.List<com.demo.advanced.daggerhilt.data.response.weather.ListEntries> forecast) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/adapter/ForecastAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "item", "Lcom/demo/advanced/daggerhilt/data/response/weather/ListEntries;", "app_stagingDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.demo.advanced.daggerhilt.data.response.weather.ListEntries item) {
        }
    }
}