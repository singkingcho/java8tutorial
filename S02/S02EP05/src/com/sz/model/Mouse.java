package com.sz.model;

import com.sz.interfaces.USB;

public class Mouse implements USB {
    @Override
    public void insert() {
        System.out.println("竖着插");
    }

    public void click(){
        System.out.println("我点点点");
    }
}
