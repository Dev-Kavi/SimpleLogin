package com.example.simplelogin

import android.app.Application
import android.content.Context
import com.example.simplelogin.di.AppComponent
import com.example.simplelogin.di.DaggerAppComponent
import timber.log.Timber

class App : Application() {
    companion object {
        lateinit var appContext: Context
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        initLogger()
    }

    fun initAppComponent(): AppComponent {
        appComponent = DaggerAppComponent.factory().create(applicationContext)
        return appComponent
    }

    private fun initLogger() {
        Timber.plant(Timber.DebugTree())
    }
}