package com.demo.advanced.daggerhilt.view.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/adapter/ViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "tabTitles", "", "", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/util/List;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_stagingDebug"})
public final class ViewPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    
    public ViewPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle lifecycle, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> tabTitles) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}