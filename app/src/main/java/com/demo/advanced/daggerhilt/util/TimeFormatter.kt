package com.demo.advanced.daggerhilt.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

class TimeFormatter {

    companion object {
        var TODAY_DATE_FORMAT = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
        const val TIME_FORMAT = "hh:mm aa"

      public  fun Long.toFormattedTime(): String {
            val date = Date(this * 1000) // Convert seconds to milliseconds
            val formatter = SimpleDateFormat(TIME_FORMAT, Locale.getDefault())
            return formatter.format(date)
        }

        @SuppressLint("SimpleDateFormat")
        fun getCurrentDateTime(dateFormat: String): String =
            SimpleDateFormat(dateFormat).format(Date())
    }


}