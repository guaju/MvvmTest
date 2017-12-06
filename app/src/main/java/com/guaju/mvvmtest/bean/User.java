package com.guaju.mvvmtest.bean;

import android.databinding.ObservableField;

/**
 * Created by guaju on 2017/12/6.
 */

public class User {
     public ObservableField<String> name=new ObservableField<>();
     public ObservableField<Integer> age=new ObservableField<>();
     public ObservableField<String> sex=new ObservableField<>();

    public User(String name,int age,String sex) {
        this.name.set(name);
        this.age.set(age);
        this.sex.set(sex);
    }
}
