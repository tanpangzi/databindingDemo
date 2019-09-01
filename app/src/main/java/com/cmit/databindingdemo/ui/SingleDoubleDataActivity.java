package com.cmit.databindingdemo.ui;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

import com.cmit.databindingdemo.R;
import com.cmit.databindingdemo.base.BaseActivityKt;
import com.cmit.databindingdemo.bean.ObservableGoods;
import com.cmit.databindingdemo.bean.User;
import com.cmit.databindingdemo.databinding.ActivitySingleDoubleBinding;

public class SingleDoubleDataActivity extends BaseActivityKt {

    ActivitySingleDoubleBinding binding;

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_single_double);
        User user = new User("tanjun", "123456");

        ObservableGoods goods = new ObservableGoods(
                new ObservableField<>("jave"),
                new ObservableField<>("android"),
                new ObservableFloat(10f));

        binding.setGoods(goods);
        binding.setUserInfo(user);
    }

}
