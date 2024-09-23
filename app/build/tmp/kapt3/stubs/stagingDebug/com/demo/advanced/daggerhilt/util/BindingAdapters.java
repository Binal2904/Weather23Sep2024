package com.demo.advanced.daggerhilt.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\t\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/advanced/daggerhilt/util/BindingAdapters;", "", "()V", "loadImage", "", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "url", "", "loadUrl", "Landroid/widget/ImageView;", "app_stagingDebug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull
    public static final com.demo.advanced.daggerhilt.util.BindingAdapters INSTANCE = null;
    
    private BindingAdapters() {
        super();
    }
    
    public final void loadUrl(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$loadUrl, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
}