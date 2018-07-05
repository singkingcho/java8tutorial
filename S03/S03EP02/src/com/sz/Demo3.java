package com.sz;

public class Demo3 {


    // 有界泛型，定了上界 上限
    public <T extends  Number> void show ( T t){
        System.out.println(t);
    }






}
