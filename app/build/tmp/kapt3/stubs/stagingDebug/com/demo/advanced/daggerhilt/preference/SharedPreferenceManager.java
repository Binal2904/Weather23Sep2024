package com.demo.advanced.daggerhilt.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tJ\f\u0010\u0014\u001a\u00020\u0015*\u00020\fH\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\fH\u0002J\f\u0010\u0018\u001a\u00020\u0019*\u00020\fH\u0002J\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002J\f\u0010\u001b\u001a\u00020\f*\u00020\fH\u0002J\f\u0010\u001c\u001a\u00020\f*\u00020\fH\u0002J\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u00020\u000e*\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "getLatitude", "", "getLongitude", "mGetSaveLoginUserData", "", "mLogout", "", "mSaveLoginUserData", "mLoginUserData", "saveLocationData", "lat", "long", "getBoolean", "", "getInt", "", "getLong", "", "getString", "getStringForLat", "getStringForLong", "put", "boolean", "int", "string", "app_stagingDebug"})
public final class SharedPreferenceManager {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences.Editor editor = null;
    
    @javax.inject.Inject
    public SharedPreferenceManager(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    private final void put(java.lang.String $this$put, long p1_1663806) {
    }
    
    private final void put(java.lang.String $this$put, int p1_52215) {
    }
    
    private final void put(java.lang.String $this$put, java.lang.String string) {
    }
    
    private final void put(java.lang.String $this$put, boolean p1_32355860) {
    }
    
    private final long getLong(java.lang.String $this$getLong) {
        return 0L;
    }
    
    private final int getInt(java.lang.String $this$getInt) {
        return 0;
    }
    
    private final java.lang.String getString(java.lang.String $this$getString) {
        return null;
    }
    
    private final java.lang.String getStringForLat(java.lang.String $this$getStringForLat) {
        return null;
    }
    
    private final java.lang.String getStringForLong(java.lang.String $this$getStringForLong) {
        return null;
    }
    
    private final boolean getBoolean(java.lang.String $this$getBoolean) {
        return false;
    }
    
    public final void mSaveLoginUserData(@org.jetbrains.annotations.NotNull
    java.lang.String mLoginUserData) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String mGetSaveLoginUserData() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void mLogout() {
    }
    
    public final void saveLocationData(double lat, double p1_1663806) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
}