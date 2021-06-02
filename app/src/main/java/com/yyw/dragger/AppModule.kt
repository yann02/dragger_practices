package com.yyw.dragger

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

const val SP_NAME = "dagger"

@Module
class AppModule(private val mApplication: MyApplication) {
    @Provides
    fun provideSharedPreferences(): SharedPreferences {
        return mApplication.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE)
    }

    @Provides
    fun provideApplication(): MyApplication {
        return mApplication
    }
}