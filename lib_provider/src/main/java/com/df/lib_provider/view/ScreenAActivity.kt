package com.df.lib_provider.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.df.lib_provider.LibSession
import com.df.lib_provider.R
import com.df.lib_provider.callbacks.RequestCallBack

class ScreenAActivity : AppCompatActivity(), RequestCallBack {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screena)

        LibSession.dependencies.requestProvider.getRequestProvider(this)

    }

    override fun onLoading(isLoading: Boolean) {
        Log.d(":::", "$isLoading")
    }

    override fun onError(error: String) {
        Log.d(":::", "$error")
    }

    override fun <T> onSuccess(t: T) {
        val response = t as String
        Log.d(":::", "$response")
    }
}