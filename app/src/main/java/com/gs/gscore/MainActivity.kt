package com.gs.gscore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gs.test.ToastUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastUtils.toast(this)
    }
}
