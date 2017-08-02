package com.example.amitrai.daggerkotlindemo.dagger

import android.app.Application
import android.content.Context
import com.example.amitrai.daggerkotlindemo.AppInitials
import com.example.amitrai.daggerkotlindemo.utility.AppConstants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by amitrai on 28/7/17.
 */

@Module
class AppModule(val app: AppInitials) {

    @Provides
    @Singleton
    fun provideContext(): Context = app

    @Provides
    @Singleton
    fun provideApplication(): Application = app

}