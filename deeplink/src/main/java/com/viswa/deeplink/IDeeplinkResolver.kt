package com.viswa.deeplink

interface IDeeplinkResolver {
    fun resolve(deepLinkString: String?): Boolean
}
