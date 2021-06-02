package com.yyw.dragger

import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        inject()
    }

    fun inject() {
        val appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        ComponentHolder.appComponent = appComponent
    }
}