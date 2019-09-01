package com.cmit.databindingdemo.ui;

import android.text.Editable;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;

import com.cmit.databindingdemo.R;
import com.cmit.databindingdemo.base.BaseActivityKt;
import com.cmit.databindingdemo.bean.User;
import com.cmit.databindingdemo.databinding.ActivityEventBindBinding;


public class EventBindActivity extends BaseActivityKt {

    ActivityEventBindBinding bindBinding;
    User user;
    @Override
    protected void initBinding() {
        bindBinding = DataBindingUtil.setContentView(this, R.layout.activity_event_bind);
        user = new User("tan", "123456");
        bindBinding.setUser(user);
        bindBinding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter{
        public void onUserNameClick(User user){
            Toast.makeText(EventBindActivity.this, "用户名称：" + user.getName(), Toast.LENGTH_SHORT).show();
        }

        public void afterTextChanged(Editable s){
            user.setName(s.toString());
            bindBinding.setUser(user);
        }

        public void afterUserPasswordChanged(Editable s){
            user.setPassword(s.toString());
            bindBinding.setUser(user);
        }
    }


}
