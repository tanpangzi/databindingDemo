package com.cmit.databindingdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.cmit.databindingdemo.R;
import com.cmit.databindingdemo.bean.User;
import com.cmit.databindingdemo.databinding.ItemUserBinding;

import java.util.List;

public class UserAdpter extends RecyclerView.Adapter<UserAdpter.UserAdapterHolder> {

    private List<User> users;
    private Context mContext;

    public UserAdpter(Context context, List<User> users) {
        mContext = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemUserBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_user, parent, false);
        return new UserAdapterHolder(binding);
    }

    @Override
    public void onBindViewHolder(UserAdapterHolder holder, int position) {
        holder.getBinding().setUser(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserAdapterHolder extends RecyclerView.ViewHolder{

        private ItemUserBinding binding;

        public UserAdapterHolder(ItemUserBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ItemUserBinding getBinding(){ return binding; }

    }

}
