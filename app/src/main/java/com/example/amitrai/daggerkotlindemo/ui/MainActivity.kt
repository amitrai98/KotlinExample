package com.example.amitrai.daggerkotlindemo.ui

import android.os.Bundle
import android.util.Log
import com.example.amitrai.daggerkotlindemo.R

class MainActivity : BaseActivity() {

    internal val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "main activity "+constant.base_url)
    }
}
