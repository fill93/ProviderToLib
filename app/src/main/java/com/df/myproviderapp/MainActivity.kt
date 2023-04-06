package com.df.myproviderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.df.lib_provider.dependencies.Dependencies

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_ir_ao_modulo).setOnClickListener {
            Toast.makeText(this, "initModule", Toast.LENGTH_SHORT).show()
            initModule(
                Dependencies(requestProvider = AppRequestProvider())
            ).goToLib()
        }
    }

    private fun initModule(dependencies: Dependencies) =
        InitModule.initDependenciesModule(
            context = this,
            dependencies = dependencies,
            style = R.style.Theme_MyProviderApp
        )
}

