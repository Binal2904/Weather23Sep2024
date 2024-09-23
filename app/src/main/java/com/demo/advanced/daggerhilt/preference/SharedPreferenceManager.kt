package com.demo.advanced.daggerhilt.preference

import android.annotation.SuppressLint
import android.content.SharedPreferences
import javax.inject.Inject

class SharedPreferenceManager @Inject constructor(private val sharedPreferences: SharedPreferences) {


    private val editor = sharedPreferences.edit()
    private fun String.put(long: Long) {
        editor.putLong(this, long)
        editor.commit()
    }

    private fun String.put(int: Int) {
        editor.putInt(this, int)
        editor.commit()
    }

    private fun String.put(string: String) {
        editor.putString(this, string)
        editor.commit()
    }

    private fun String.put(boolean: Boolean) {
        editor.putBoolean(this, boolean)
        editor.commit()
    }

    private fun String.getLong() = sharedPreferences.getLong(this, 0)

    private fun String.getInt() = sharedPreferences.getInt(this, 0)

    private fun String.getString() = sharedPreferences.getString(this, "")!!

    private fun String.getStringForLat() = sharedPreferences.getString(this, "21.257381")!!
    private fun String.getStringForLong() = sharedPreferences.getString(this, "431.059570")!!

    private fun String.getBoolean() = sharedPreferences.getBoolean(this, false)
    fun mSaveLoginUserData(mLoginUserData: String) {
        sharedPreferences.edit().putString("Key", mLoginUserData).apply()
    }

    fun mGetSaveLoginUserData(): String? {
        return sharedPreferences.getString("Key", "defaultValue")
    }

    @SuppressLint("CommitPrefEdits")
    fun mLogout() {
        sharedPreferences.edit().clear()
        sharedPreferences.edit().apply()
    }

    fun saveLocationData(lat: Double, long: Double) {
        "lat".put(lat.toString())
        "long".put(long.toString())
    }

    fun getLatitude(): Double {
        return "lat".getStringForLat().toDouble()
    }

    fun getLongitude(): Double {
        return "long".getStringForLong().toDouble()
    }


}