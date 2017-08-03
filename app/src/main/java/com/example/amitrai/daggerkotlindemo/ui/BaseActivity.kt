package com.example.amitrai.daggerkotlindemo.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.amitrai.daggerkotlindemo.R
import com.example.amitrai.daggerkotlindemo.utility.AppConstants


open class BaseActivity : AppCompatActivity() {

    var constant = AppConstants()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        Log.e("base activity", "i am new here "+constant.getTasks())
    }

}
