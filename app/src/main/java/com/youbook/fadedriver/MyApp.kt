package com.youbook.fadedriver

import android.app.Application
import com.youbook.fadedriver.utils.SocketConnector

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        SocketConnector.initSocket(this)
    }
}