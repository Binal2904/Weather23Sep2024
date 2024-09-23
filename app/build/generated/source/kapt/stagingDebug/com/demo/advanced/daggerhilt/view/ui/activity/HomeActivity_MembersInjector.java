// Generated by Dagger (https://dagger.dev).
package com.demo.advanced.daggerhilt.view.ui.activity;

import com.demo.advanced.daggerhilt.preference.SharedPreferenceManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final Provider<SharedPreferenceManager> sharedPrefProvider;

  public HomeActivity_MembersInjector(Provider<SharedPreferenceManager> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  public static MembersInjector<HomeActivity> create(
      Provider<SharedPreferenceManager> sharedPrefProvider) {
    return new HomeActivity_MembersInjector(sharedPrefProvider);
  }

  @Override
  public void injectMembers(HomeActivity instance) {
    injectSharedPref(instance, sharedPrefProvider.get());
  }

  @InjectedFieldSignature("com.demo.advanced.daggerhilt.view.ui.activity.HomeActivity.sharedPref")
  public static void injectSharedPref(HomeActivity instance, SharedPreferenceManager sharedPref) {
    instance.sharedPref = sharedPref;
  }
}
