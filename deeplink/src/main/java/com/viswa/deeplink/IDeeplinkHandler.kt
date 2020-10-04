package com.viswa.deeplink

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

interface IDeeplinkHandler {
    fun process(intent: Intent, activity: AppCompatActivity?, shouldRender: Boolean = true) : Bundle?
}