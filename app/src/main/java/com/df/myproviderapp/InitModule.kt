package com.df.myproviderapp

import android.content.Context
import com.df.lib_provider.LibInitializer
import com.df.lib_provider.dependencies.Dependencies

object InitModule {

    fun initDependenciesModule(
        context: Context,
        dependencies: Dependencies,
        style: Int
    ) = LibInitializer.Builder(
        context = context,
        dependencies = dependencies,
        style = style
    ).build()

}