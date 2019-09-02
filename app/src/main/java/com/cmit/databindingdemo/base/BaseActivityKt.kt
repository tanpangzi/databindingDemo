package com.cmit.databindingdemo.base

import android.app.Activity
import android.os.Bundle

abstract class BaseActivityKt() : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBinding()
    }

    protected abstract fun initBinding()


}
