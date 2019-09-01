package com.cmit.databindingdemo.bean

import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat

data class User(var name: String, var password:String)

data class ObservableGoods(val name: ObservableField<String>,
                 val details: ObservableField<String>,
                 val price:ObservableFloat)
