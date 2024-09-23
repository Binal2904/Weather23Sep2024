// Generated by Dagger (https://dagger.dev).
package com.demo.advanced.daggerhilt.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPreferenceModule_ProvideSharedPreferenceModeFactory implements Factory<Integer> {
  private final SharedPreferenceModule module;

  public SharedPreferenceModule_ProvideSharedPreferenceModeFactory(SharedPreferenceModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideSharedPreferenceMode(module);
  }

  public static SharedPreferenceModule_ProvideSharedPreferenceModeFactory create(
      SharedPreferenceModule module) {
    return new SharedPreferenceModule_ProvideSharedPreferenceModeFactory(module);
  }

  public static int provideSharedPreferenceMode(SharedPreferenceModule instance) {
    return instance.provideSharedPreferenceMode();
  }
}
