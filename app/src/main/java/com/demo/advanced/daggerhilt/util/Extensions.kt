package com.demo.advanced.daggerhilt.util

import android.view.View
import java.text.SimpleDateFormat
import java.util.*


fun View.show() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun Double.toCelsius() = this - 273.15