package com.example.amitrai.daggerkotlindemo.dagger

import com.example.amitrai.daggerkotlindemo.ui.BaseActivity
import dagger.Component
import javax.inject.Singleton



/**
 * Created by amitrai on 28/7/17.
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        NetworkModule::class)
)
interface AppComponent {

    fun inject(baseActivity: BaseActivity)

}
