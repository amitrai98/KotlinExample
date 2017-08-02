package com.example.amitrai.daggerkotlindemo

import android.app.Application
import com.example.amitrai.daggerkotlindemo.dagger.AppComponent
import com.example.amitrai.daggerkotlindemo.dagger.AppModule


/**
 * Created by amitrai on 31/7/17.
 */
class AppInitials : Application(){

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
                .build()
    }
}