package com.sz;

public class Bar  extends  Foo{


    @Override
    public void setName(String name){

        super.setName("哈哈哈");
        System.out.println("set bar");
    }


}
