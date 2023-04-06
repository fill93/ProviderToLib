package com.df.lib_provider

import android.content.Context
import com.df.lib_provider.dependencies.Dependencies

object LibInitializer {

    data class Builder(
        private val context: Context,
        private val dependencies: Dependencies,
        private val style: Int
    ) {
        fun build() = apply {
            LibSession.dependencies = dependencies
            LibSession.currentTheme = style
        }

        fun goToLib() {
            LibRouter.goToScreenA(context)
        }
    }
}