package com.nova.network.interceptor.log

import okhttp3.Request
import java.io.IOException

/**
 * @author ihsan on 8/12/18.
 */
interface BufferListener {
    @Throws(IOException::class)
    fun getJsonResponse(request: Request?): String?
}