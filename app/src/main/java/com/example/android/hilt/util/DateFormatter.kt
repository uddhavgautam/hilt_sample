package com.example.android.hilt.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton

/**
 * String formatter for the log dates.
 */

//example of constructor injection
//it means instance of DateFormatter is injected into Hilt's framework

class DateFormatter @Inject constructor(){

    @SuppressLint("SimpleDateFormat")
    private val formatter = SimpleDateFormat("d MMM yyyy HH:mm:ss")

    fun formatDate(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}
