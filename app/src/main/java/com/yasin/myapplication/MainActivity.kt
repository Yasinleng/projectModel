package com.yasin.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loggingInterceptor = LoggingInterceptor.Builder()
            .setLevel(Level.BASIC)
            .log(Log.VERBOSE)
            .build()
    }
}