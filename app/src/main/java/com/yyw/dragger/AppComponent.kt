package com.yyw.dragger

import android.content.SharedPreferences
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun mApplication(): MyApplication
    fun sharedPreferences(): SharedPreferences
}