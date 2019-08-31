package com.cmit.datrabindingdemo.ui;

import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import com.cmit.datrabindingdemo.R;
import com.cmit.datrabindingdemo.base.BaseActivityKt;
import com.cmit.datrabindingdemo.bean.User;
import com.cmit.datrabindingdemo.databinding.ActivityEventBindBinding;

public class EventBindActivity extends BaseActivityKt {

    ActivityEventBindBinding bindBinding;
    User user;
    @Override
    protected void initBinding() {
        bindBinding = DataBindingUtil.setContentView(this, R.layout.activity_event_bind);
        user = new User("tan", "123456");
        bindBinding.setUser(user);
    }

    public class UserPresenter{
        public void onUserNameClick(){
            Toast.makeText(EventBindActivity.this, "用户名称：" + user.getName(), Toast.LENGTH_SHORT).show();
        }
    }


}
