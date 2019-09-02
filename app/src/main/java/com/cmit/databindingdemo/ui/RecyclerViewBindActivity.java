package com.cmit.databindingdemo.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cmit.databindingdemo.R;
import com.cmit.databindingdemo.adapter.UserAdpter;
import com.cmit.databindingdemo.base.BaseActivityKt;
import com.cmit.databindingdemo.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecyclerViewBindActivity extends BaseActivityKt {

    List<User> users = new ArrayList<>();

    @Override
    protected void initBinding() {
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initData();
        UserAdpter adpter = new UserAdpter(this, users);
        recyclerView.setAdapter(adpter);
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            User user = new User("tanjun"+i, String.valueOf(new Random().nextInt(100)));
            users.add(user);
        }
    }

}
