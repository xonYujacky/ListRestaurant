package com.xonYuJackt.thehungrydev;

import androidx.annotation.NonNull;

public class Dish {
    String title;
    String desciption;
    int price;

    Dish(String title,String desciption,int price){
        this.title = title;
        this.desciption = desciption;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}


