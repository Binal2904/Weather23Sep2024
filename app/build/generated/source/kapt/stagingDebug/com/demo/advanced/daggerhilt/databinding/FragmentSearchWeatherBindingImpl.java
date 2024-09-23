package com.demo.advanced.daggerhilt.databinding;
import com.demo.advanced.daggerhilt.R;
import com.demo.advanced.daggerhilt.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchWeatherBindingImpl extends FragmentSearchWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.input_find_city_weather, 3);
        sViewsWithIds.put(R.id.text_label_search_for_city, 4);
        sViewsWithIds.put(R.id.image_city, 5);
        sViewsWithIds.put(R.id.constraint_layout_showing_temp, 6);
        sViewsWithIds.put(R.id.recycler_view_searched_city_temperature, 7);
        sViewsWithIds.put(R.id.image_weather_symbol, 8);
        sViewsWithIds.put(R.id.text_label_today, 9);
        sViewsWithIds.put(R.id.text_todays_date, 10);
        sViewsWithIds.put(R.id.text_temperature, 11);
        sViewsWithIds.put(R.id.text_label_degree, 12);
        sViewsWithIds.put(R.id.text_city_name, 13);
        sViewsWithIds.put(R.id.image_weather_human_reaction, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentSearchWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
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