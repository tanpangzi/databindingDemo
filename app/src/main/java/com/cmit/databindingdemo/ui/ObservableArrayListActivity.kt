package com.cmit.databindingdemo.ui

import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.LinearLayoutManager
import com.cmit.databindingdemo.R
import com.cmit.databindingdemo.adapter.UserAdpter
import com.cmit.databindingdemo.base.BaseActivityKt
import com.cmit.databindingdemo.bean.User
import com.cmit.databindingdemo.observable.DynamicChangeCallback
import kotlinx.android.synthetic.main.activity_obaservable_arraylist.*
import java.util.ArrayList
import kotlin.random.Random

class ObservableArrayListActivity : BaseActivityKt(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btn_add_item -> addItem()
            R.id.btn_add_item_list-> addItemList()
            R.id.btn_remove_item -> removeItem()
            R.id.btn_update_item -> updateItem()

        }
    }

    private var userObservableList : ObservableArrayList<User> ?= null

    override fun initBinding() {
        setContentView(R.layout.activity_obaservable_arraylist)
        recycler_view.layoutManager = LinearLayoutManager(this)
        initData()

        var mAdapter = UserAdpter(this, userObservableList)
        mAdapter.notifyDataSetChanged()
        recycler_view.adapter = mAdapter

        btn_add_item.setOnClickListener(this)
        btn_add_item.setOnClickListener(this)
        btn_remove_item.setOnClickListener(this)
        btn_update_item.setOnClickListener(this)

    }

    private fun initData() {
        userObservableList = ObservableArrayList()
        for(index in 1..30){
            userObservableList!!.add(User("user$index", Random(100).toString()))
        }
    }

    private fun addItem(){
        if(userObservableList!!.size > 3){
            val user = User("user_"+100, (Random.nextInt()*4).toString())
            userObservableList!!.add(user)
        }
    }

    private fun addItemList(){
        if (userObservableList!!.size > 3){
            var userList:ArrayList<User> = ArrayList()
            for(index in 0..3){
                userList.add(User("user_100", (Random.nextInt()*4).toString()))
            }
            userObservableList!!.addAll(userList)
        }
    }

    private fun removeItem(){
        if (userObservableList!!.size >3){
            userObservableList!!.removeAt(1)
        }
    }

    private fun updateItem(){
        if (userObservableList!!.size > 3){
            var user = userObservableList!!.get(1)
            user.name = "user_"+Random.nextInt()
            userObservableList!![1] = user
        }
    }


}
