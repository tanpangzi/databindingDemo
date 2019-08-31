package com.cmit.datrabindingdemo.bean

import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat

data class User(val name: String, val password:String)

data class ObservableGoods(val name: ObservableField<String>,
                 val details: ObservableField<String>,
                 val price:ObservableFloat)
