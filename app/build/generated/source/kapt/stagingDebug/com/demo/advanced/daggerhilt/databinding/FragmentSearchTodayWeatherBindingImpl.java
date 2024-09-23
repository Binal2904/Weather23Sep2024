package com.demo.advanced.daggerhilt.databinding;
import com.demo.advanced.daggerhilt.R;
import com.demo.advanced.daggerhilt.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchTodayWeatherBindingImpl extends FragmentSearchTodayWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutWeatherAdditional, 2);
        sViewsWithIds.put(R.id.layoutSunsetSunrise, 3);
        sViewsWithIds.put(R.id.app_bar_layout, 4);
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.input_find_city_weather, 6);
        sViewsWithIds.put(R.id.ivCity, 7);
        sViewsWithIds.put(R.id.ivWeatherHumanReaction, 8);
        sViewsWithIds.put(R.id.ivWeatherImage, 9);
        sViewsWithIds.put(R.id.tvCityName, 10);
        sViewsWithIds.put(R.id.tvLabelToday, 11);
        sViewsWithIds.put(R.id.tvTodaysDate, 12);
        sViewsWithIds.put(R.id.tvTemperature, 13);
        sViewsWithIds.put(R.id.tvLabelDegree, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchTodayWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentSearchTodayWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (bindings[3] != null) ? com.demo.advanced.daggerhilt.databinding.LayoutSunriseSunsetBinding.bind((android.view.View) bindings[3]) : null
            , (bindings[2] != null) ? com.demo.advanced.daggerhilt.databinding.LayoutWeatherAdditionalInfoBinding.bind((android.view.View) bindings[2]) : null
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            );
        this.constraintLayoutShowingTemp.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}