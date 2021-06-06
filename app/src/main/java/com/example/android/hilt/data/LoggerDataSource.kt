package com.example.android.hilt.data

import com.example.android.hilt.data.entity.Log

/**
 * Created by Uddhav P. Gautam <upgautam@ualr.edu> on 6/4/2021.
 */

// Common interface for Logger data sources.
interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}