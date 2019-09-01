package com.cmit.databindingdemo.bean;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

public class ObserveGoods {
    public ObservableField<String> name;
    public ObservableField<String> details;
    public ObservableFloat price;

    public ObserveGoods() {
    }

    public ObserveGoods(String name, String details, float price) {
        this.name = new ObservableField<>(name);
        this.details = new ObservableField<>(details);
        this.price = new ObservableFloat(price);
    }
}
