package com.demo.advanced.daggerhilt.view.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J-\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/demo/advanced/daggerhilt/view/ui/activity/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/location/LocationListener;", "()V", "binding", "Lcom/demo/advanced/daggerhilt/databinding/ActivityHomeBinding;", "locationManager", "Landroid/location/LocationManager;", "locationPermissionCode", "", "sharedPref", "Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;", "getSharedPref", "()Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;", "setSharedPref", "(Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;)V", "getLocation", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "Landroid/location/Location;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_stagingDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity implements android.location.LocationListener {
    @javax.inject.Inject
    public com.demo.advanced.daggerhilt.preference.SharedPreferenceManager sharedPref;
    private android.location.LocationManager locationManager;
    private final int locationPermissionCode = 2;
    private com.demo.advanced.daggerhilt.databinding.ActivityHomeBinding binding;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.demo.advanced.daggerhilt.preference.SharedPreferenceManager getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    com.demo.advanced.daggerhilt.preference.SharedPreferenceManager p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLocation() {
    }
    
    @java.lang.Override
    public void onLocationChanged(@org.jetbrains.annotations.NotNull
    android.location.Location location) {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}