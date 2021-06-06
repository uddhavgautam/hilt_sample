package com.example.android.hilt.data

import com.example.android.hilt.data.entity.Log
import dagger.hilt.android.scopes.ActivityScoped
import java.util.*
import javax.inject.Inject

/**
 * Created by Uddhav P. Gautam <upgautam@ualr.edu> on 6/4/2021.
 */

class LoggerInMemoryDataSource  @Inject constructor() : LoggerDataSource {

    private val logs = LinkedList<Log>()

    override fun addLog(msg: String) {
        logs.addFirst(Log(msg, System.currentTimeMillis()))
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        callback(logs)
    }

    override fun removeLogs() {
        logs.clear()
    }
}