package com.sz;

/**
 * 在类级别上加上了泛型，那么整个类各处都可以使用
 * @param <T>
 */
public class Demo1<T> {

    private T t;

    public Demo1(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
