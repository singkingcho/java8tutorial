package com.sz.model;

/**
 * 支付概念，但是如何实现，如何去做，我不知道。
 * 如果某些群体当中有许多公共的特点。
 *
 */
public abstract class Pay {

    private String name;



    public abstract  void pay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void haha(){
        System.out.println("hahahahahaha....");
    }
}
