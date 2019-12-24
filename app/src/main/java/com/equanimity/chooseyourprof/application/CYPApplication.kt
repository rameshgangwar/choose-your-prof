package com.equanimity.chooseyourprof.application

import android.app.Application
import timber.log.Timber

class CYPApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}