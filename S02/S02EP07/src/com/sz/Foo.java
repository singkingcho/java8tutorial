package com.sz;

public class Foo {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        System.out.println("foo 的 set 方法");
        this.name = name;
    }
}
