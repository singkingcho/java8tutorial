package com.sz.model;

/**
 * 购物车
 */
public class Cart {

//    private ItemBuyDetail[] ItemBuyDetail;

    /**
     * 初始长度
     */
    private int initLength = 10;

    /**
     * 扩容的大小
     */
    private int expandLength = 8;

    /**
     * 我定义一个容器，描述容器的可用大小
     */

    private int size;

    private ItemBuyDetail[] itemBuyDetails;


    public Cart(){
        itemBuyDetails = new ItemBuyDetail[initLength];
    }


    /**
     * 由用户指定数组长度
     * @param len
     */
    public Cart(int len){
        if(len <= 0){
            throw  new RuntimeException("容器长度不能为0");
        } else {
            itemBuyDetails = new ItemBuyDetail[len < initLength ? initLength:len];
        }
    }


    public void add(ItemBuyDetail ItemBuyDetail){
        if(size >= itemBuyDetails.length){
            // 不够用了呢？
            // 扩容
            expand(itemBuyDetails);
        }
        itemBuyDetails[size] = ItemBuyDetail;
        size++;
    }

    private void expand(ItemBuyDetail[] ItemBuyDetails) {
        ItemBuyDetail[] is = new ItemBuyDetail[ItemBuyDetails.length + expandLength];
        // 完成复制的工作
        for(int i = 0 ; i < ItemBuyDetails.length ; i++){
            is[i] = ItemBuyDetails[i];
        }
        itemBuyDetails =  is;
    }


    public int getSize() {
        return size;
    }


    public ItemBuyDetail get(int index){
        return itemBuyDetails[index];
    }




}
