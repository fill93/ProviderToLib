package com.df.myproviderapp

import com.df.lib_provider.callbacks.RequestCallBack
import com.df.lib_provider.providers.RequestProvider

class AppRequestProvider: RequestProvider {

    override fun getRequestProvider(requestCallBack: RequestCallBack) {
        requestCallBack.onLoading(true)
        requestCallBack.onError("Error teste")
        requestCallBack.onSuccess("sucesso teste")
        requestCallBack.onLoading(false)
    }
}
