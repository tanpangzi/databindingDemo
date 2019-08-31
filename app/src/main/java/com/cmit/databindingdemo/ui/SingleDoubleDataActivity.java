package com.cmit.datrabindingdemo.ui;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;
import com.cmit.datrabindingdemo.R;
import com.cmit.datrabindingdemo.base.BaseActivityKt;
import com.cmit.datrabindingdemo.bean.ObservableGoods;
import com.cmit.datrabindingdemo.bean.User;
import com.cmit.datrabindingdemo.databinding.ActivitySingleDoubleBinding;

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
