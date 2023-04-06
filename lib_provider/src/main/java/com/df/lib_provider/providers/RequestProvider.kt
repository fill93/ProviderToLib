package com.df.lib_provider.providers

import com.df.lib_provider.callbacks.RequestCallBack

interface RequestProvider {
    fun getRequestProvider(requestCallBack: RequestCallBack)
}