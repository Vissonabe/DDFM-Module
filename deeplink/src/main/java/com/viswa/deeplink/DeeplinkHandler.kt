package com.viswa.deeplink

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DeeplinkHandler constructor(private val processors: Set<@JvmSuppressWildcards IDeeplinkProcessor>) : IDeeplinkHandler {
    override fun process(intent: Intent, activity: AppCompatActivity?, shouldRender: Boolean): Bundle? {
        processors.forEach {
            if(it.matches(intent)){
                val processedIntent =  it.process(intent)
                if (shouldRender) {
                    activity?.let { activity -> it.renderTarget(processedIntent, activity) }
                }
                return processedIntent.extras
            }
        }
        return null
    }
}