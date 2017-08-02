package com.example.amitrai.daggerkotlindemo.ui

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.amitrai.daggerkotlindemo.AppInitials
import com.example.amitrai.daggerkotlindemo.R
import com.example.amitrai.daggerkotlindemo.dagger.AppModule

import kotlinx.android.synthetic.main.activity_base.*
import javax.inject.Inject

class BaseActivity : AppCompatActivity() {

    @Inject lateinit var appModule: AppModule


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        setSupportActionBar(toolbar)

        AppInitials.appComponent.inject(this)
        appModule.provideApplication()
        appModule.provideContext()
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
