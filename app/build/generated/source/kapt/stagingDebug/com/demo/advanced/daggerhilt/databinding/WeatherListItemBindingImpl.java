package com.demo.advanced.daggerhilt.databinding;
import com.demo.advanced.daggerhilt.R;
import com.demo.advanced.daggerhilt.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class WeatherListItemBindingImpl extends WeatherListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.weatherWrapper, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public WeatherListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private WeatherListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.temp.setTag(null);
        this.tvDate.setTag(null);
        this.weatherDescription.setTag(null);
        this.weatherIcon.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.demo.advanced.daggerhilt.data.response.weather.ListEntries) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.demo.advanced.daggerhilt.data.response.weather.ListEntries ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.demo.advanced.daggerhilt.data.response.weather.Main viewModelMain = null;
        java.util.List<com.demo.advanced.daggerhilt.data.response.weather.Weather> viewModelWeather = null;
        java.lang.String viewModelWeatherGetInt0IconUrl = null;
        java.lang.String viewModelDateTime = null;
        java.lang.String viewModelWeatherGetInt0Main = null;
        java.lang.String tempAndroidStringDegreesViewModelMainTempInCelsius = null;
        com.demo.advanced.daggerhilt.data.response.weather.ListEntries viewModel = mViewModel;
        com.demo.advanced.daggerhilt.data.response.weather.Weather viewModelWeatherGetInt0 = null;
        java.lang.String viewModelMainTempInCelsius = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.main
                    viewModelMain = viewModel.getMain();
                    // read viewModel.weather
                    viewModelWeather = viewModel.getWeather();
                    // read viewModel.dateTime
                    viewModelDateTime = viewModel.getDateTime();
                }


                if (viewModelMain != null) {
                    // read viewModel.main.tempInCelsius
                    viewModelMainTempInCelsius = viewModelMain.getTempInCelsius();
                }
                if (viewModelWeather != null) {
                    // read viewModel.weather.get(0)
                    viewModelWeatherGetInt0 = viewModelWeather.get(0);
                }


                // read @android:string/degrees
                tempAndroidStringDegreesViewModelMainTempInCelsius = temp.getResources().getString(R.string.degrees, viewModelMainTempInCelsius);
                if (viewModelWeatherGetInt0 != null) {
                    // read viewModel.weather.get(0).iconUrl
                    viewModelWeatherGetInt0IconUrl = viewModelWeatherGetInt0.getIconUrl();
                    // read viewModel.weather.get(0).main
                    viewModelWeatherGetInt0Main = viewModelWeatherGetInt0.getMain();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.temp, tempAndroidStringDegreesViewModelMainTempInCelsius);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, viewModelDateTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weatherDescription, viewModelWeatherGetInt0Main);
            com.demo.advanced.daggerhilt.util.BindingAdapters.loadImage(this.weatherIcon, viewModelWeatherGetInt0IconUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}