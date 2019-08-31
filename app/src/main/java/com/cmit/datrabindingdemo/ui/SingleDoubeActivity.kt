package com.cmit.datrabindingdemo.ui

import androidx.databinding.DataBindingUtil
import com.cmit.datrabindingdemo.R
import com.cmit.datrabindingdemo.base.BaseActivityKt
import com.cmit.datrabindingdemo.databinding.ActivitySingleDoubleBinding


class SingleDoubeActivity : BaseActivityKt() {

    var binding: ActivitySingleDoubleBinding?= null

    override fun initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_single_double)
    }


}
