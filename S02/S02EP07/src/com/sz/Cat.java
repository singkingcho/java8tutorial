package com.sz;

public class Cat {

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(){

    }

    public Cat(String name){
        this.setName(name);
    }


    public Cat(String name,int age){
        this(name);
        this.age = age;
    }
}