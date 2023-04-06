package com.df.lib_provider.callbacks

interface RequestCallBack {
    fun onLoading(isLoading: Boolean)
    fun onError(error: String)
    fun <T> onSuccess(t: T)
}