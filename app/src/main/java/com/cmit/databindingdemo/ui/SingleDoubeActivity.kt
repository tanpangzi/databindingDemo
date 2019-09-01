package com.cmit.databindingdemo.ui

import androidx.databinding.DataBindingUtil
import com.cmit.databindingdemo.R
import com.cmit.databindingdemo.base.BaseActivityKt
import com.cmit.databindingdemo.databinding.ActivitySingleDoubleBinding


class SingleDoubeActivity : BaseActivityKt() {

    var binding: ActivitySingleDoubleBinding?= null

    override fun initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_single_double)
    }


}
