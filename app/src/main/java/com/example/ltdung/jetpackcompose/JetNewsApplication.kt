package com.example.ltdung.jetpackcompose

import android.app.Application
import android.util.Log
import com.example.ltdung.jetpackcompose.data.AppContainer
import com.example.ltdung.jetpackcompose.data.AppContainerImpl

class JetNewsApplication : Application() {

    companion object {
        private const val TAG = "JetNewsApplication"
    }

    // AppContainer instance used by the reset of classes to obtain dependencies
    lateinit var container: AppContainer

    override fun onCreate() {
        Log.d(TAG, "onCreate")
        super.onCreate()
        container = AppContainerImpl(this.applicationContext)
    }
}