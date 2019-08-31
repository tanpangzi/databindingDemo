package com.cmit.datrabindingdemo.ui;

import android.view.View;
import androidx.databinding.*;
import com.cmit.datrabindingdemo.R;
import com.cmit.datrabindingdemo.base.BaseActivityKt;
import com.cmit.datrabindingdemo.databinding.ActivityBaseCollectBinding;

import java.util.Random;

public class BaseCollectActivity extends BaseActivityKt {

    ActivityBaseCollectBinding binding;
    private ObservableMap<String, String> map;
    private ObservableList<String> list;

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base_collect);

        map = new ObservableArrayMap<>();
        list = new ObservableArrayList<>();
        map.put("name", "tan");
        map.put("age", "18");
        binding.setMap(map);

        list.add("tan");
        list.add("jun");

        binding.setList(list);

        binding.setIndex(0);
        binding.setKey("name");

        binding.btnChangeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map.put("name","jun" + (new Random().nextInt(100)));
            }
        });
    }


}
