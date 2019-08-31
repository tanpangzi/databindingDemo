package com.cmit.datrabindingdemo.ui;

import androidx.databinding.DataBindingUtil;
import com.cmit.datrabindingdemo.R;
import com.cmit.datrabindingdemo.base.BaseActivityKt;
import com.cmit.datrabindingdemo.bean.Goods;
import com.cmit.datrabindingdemo.databinding.ActivityBaseobserverBinding;

import java.util.Random;

public class BaseObserverActivity extends BaseActivityKt {

    ActivityBaseobserverBinding binding;
    Goods mGoods;

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_baseobserver);
        mGoods = new Goods("code", "hi",24);
        binding.setGoods(mGoods);
        binding.setGoodsHandler(new GoodsHandler());


    }

    public class GoodsHandler{
        public void changeName(){
            mGoods.setName("code:"+ new Random().nextInt(100));
            mGoods.setPrice(new Random().nextInt(100));
        }

        public void changGoodsDetail(){
            mGoods.setDetails("hi" + new Random().nextInt(100));
            mGoods.setPrice(new Random().nextInt(100));
        }
    }


}
