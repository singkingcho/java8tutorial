package com.sz;

import org.apache.log4j.Logger;

public class User {

    private static final Logger LOGGER = Logger.getLogger("com.sz.User");


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 || age >180){
            LOGGER.warn("年龄不符合实际情况，请你真诚一点");
            return;
        }
        this.age = age;
    }
}
