package com.demo.advanced.daggerhilt;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.demo.advanced.daggerhilt.databinding.FragmentSearchTodayWeatherBindingImpl;
import com.demo.advanced.daggerhilt.databinding.FragmentSearchWeatherBindingImpl;
import com.demo.advanced.daggerhilt.databinding.ListItemSearchedCityTemperatureBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTSEARCHTODAYWEATHER = 1;

  private static final int LAYOUT_FRAGMENTSEARCHWEATHER = 2;

  private static final int LAYOUT_LISTITEMSEARCHEDCITYTEMPERATURE = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.advanced.daggerhilt.R.layout.fragment_search_today_weather, LAYOUT_FRAGMENTSEARCHTODAYWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.advanced.daggerhilt.R.layout.fragment_search_weather, LAYOUT_FRAGMENTSEARCHWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.demo.advanced.daggerhilt.R.layout.list_item_searched_city_temperature, LAYOUT_LISTITEMSEARCHEDCITYTEMPERATURE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTSEARCHTODAYWEATHER: {
          if ("layout/fragment_search_today_weather_0".equals(tag)) {
            return new FragmentSearchTodayWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_today_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHWEATHER: {
          if ("layout/fragment_search_weather_0".equals(tag)) {
            return new FragmentSearchWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSEARCHEDCITYTEMPERATURE: {
          if ("layout/list_item_searched_city_temperature_0".equals(tag)) {
            return new ListItemSearchedCityTemperatureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_searched_city_temperature is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_search_today_weather_0", com.demo.advanced.daggerhilt.R.layout.fragment_search_today_weather);
      sKeys.put("layout/fragment_search_weather_0", com.demo.advanced.daggerhilt.R.layout.fragment_search_weather);
      sKeys.put("layout/list_item_searched_city_temperature_0", com.demo.advanced.daggerhilt.R.layout.list_item_searched_city_temperature);
    }
  }
}
