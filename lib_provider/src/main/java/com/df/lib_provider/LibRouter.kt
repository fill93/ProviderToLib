package com.df.lib_provider

import android.content.Context
import android.content.Intent
import com.df.lib_provider.view.ScreenAActivity

object LibRouter {

    fun goToScreenA(context: Context) {
        val intent = Intent(context, ScreenAActivity::class.java)
        context.startActivity(intent)
    }
}