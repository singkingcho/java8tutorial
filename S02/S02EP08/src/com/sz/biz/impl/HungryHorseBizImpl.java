package com.sz.biz.impl;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.sz.biz.HungryHorseBiz;
import com.sz.db.CustomDB;
import com.sz.model.*;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HungryHorseBizImpl implements HungryHorseBiz {

    private static final Logger LOGGER = Logger.getLogger(HungryHorseBizImpl.class);

    private Scanner scanner = new Scanner(System.in);


    @Override
    public void welcome() {
        System.out.println("欢迎来到饿了马》》》》》》》");
        System.out.println("请根据菜单进行选择：" +
                " 1 查看商家 0 退出");
        int choice = 0;
        do{
            try {
                choice = scanner.nextInt();
                // TODO  （等待完成工作的含义） 请你完成客户输入可能没有对应选项的问题
                break;
            } catch (InputMismatchException e){
                LOGGER.error("用户输入数字有误");
                System.out.println("请重新输入：");
                scanner.next();
            }
        }while(true);

        switch (choice){
            case 0:
                LOGGER.info("用户已经退出系统");
                break;
            case 1:
                Saler[] salers = selectAllSalers();
                System.out.println("序号\t商家名称\t");
                for(int i = 0 ; i < salers.length ; i ++){
                    System.out.println((i+1) +"\t" + salers[i].getName());
                }
                System.out.println("请选择商家输入序号即可");
                int salesChoice = scanner.nextInt();
                // 根据商家的序号去查询对应商家的提供的商品
                Item[] items = salers[salesChoice - 1].getItems();

                for(int i = 0 ; i < items.length ;i ++){
                    System.out.print((i+1) +"\t");
                    System.out.println(items[i]);
                }
                System.out.println("请选择商品序号:");
                String stillShopping = null;
                Cart cart = new Cart();
                int itemNo;
                double itemNum;
                while(true){
                    System.out.println("您是否选择继续购物（y/n）：");
                    stillShopping = scanner.next();
                    if(stillShopping.equalsIgnoreCase("y")){
                        System.out.println("请选择商品序号:");
                        itemNo = scanner.nextInt();
                        System.out.println("请输入您需要的数量：");
                        itemNum = scanner.nextDouble();
                        ItemBuyDetail ibd = new ItemBuyDetail();
                        ibd.setItem(items[itemNo-1]);
                        ibd.setNum(itemNum);
                        ibd.setTotalPrice();
                        cart.add(ibd);
                    } else {
                        break;
                    }
                }
                // 准备结算
                // 计算总价
                double totalPrice = 0;
                for(int i = 0 ; i < cart.getSize(); i++){
//                    System.out.println(cart.get(i));
                    totalPrice += cart.get(i).getTotalPrice();
                }

                // 付款， 生成一个订单和对应的订单详情，账户扣款。
                Orders orders = new Orders();
                Date now = new Date();
                orders.setCid(now.getTime() + "");
                orders.setDate(now);
//                orders.setOid("什么用户");
                orders.setTotalPrice(totalPrice);
                Orders[] orss = CustomDB.getOrders();
                for(int i = 0 ; i < orss.length ; i++){
                    if(orss[i] == null){
                        orss[i] = orders;
                        break;
                    }
                }
                CustomDB.setOrders(orss);


                for(int i = 0 ; i < orss.length ; i++){
                    if(orss[i] == null){

                        break;
                    } else {
                        System.out.println(orss[i]);
                    }
                }
                break;
            default:
                break;
        }

    }

    @Override
    public Saler[] selectAllSalers() {
        return CustomDB.getSalers();
    }
}
