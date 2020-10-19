package com.viswa.deeplink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

interface IDeeplinkProcessor {
    fun matches(intent: Intent): Boolean

    fun process(intent: Intent): Intent

    fun renderTarget(childIntent: Intent, activity: AppCompatActivity)

    fun getIntentFlags() = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
}
