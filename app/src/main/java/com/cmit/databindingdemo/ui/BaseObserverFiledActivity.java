package com.cmit.databindingdemo.ui;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

import com.cmit.databindingdemo.R;
import com.cmit.databindingdemo.base.BaseActivityKt;
import com.cmit.databindingdemo.bean.ObservableGoods;
import com.cmit.databindingdemo.databinding.ActivityBaseobserverfiledBinding;

import java.util.Random;

public class BaseObserverFiledActivity extends BaseActivityKt {

    ObservableGoods observableGoods;
    ActivityBaseobserverfiledBinding binding;

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_baseobserverfiled);

        observableGoods = new ObservableGoods(new ObservableField<>("code"),
                new ObservableField<>("hi"),
                new ObservableFloat(24));

        binding.setGoods(observableGoods);
        binding.setObservableGoodsHandler(new ObservableGooodsHandler());
    }

    public class ObservableGooodsHandler{

        public void changeGoodsName() {
            observableGoods.getName().set("code" + new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            observableGoods.getDetails().set("hi" + new Random().nextInt(100));
        }

    }

}
