package com.sz.db;

import com.sz.model.Item;
import com.sz.model.Orders;
import com.sz.model.OrdersDetail;
import com.sz.model.Saler;

/**
 * 自定义数据库模拟数据库
 */
public class CustomDB {

    private static Saler[] salers;

    private static Item[] items;

    private static Orders[] orders = new Orders[100];

    private static OrdersDetail[] ordersDetails = new OrdersDetail[100];


    public static Saler[] getSalers() {
        return salers;
    }

    public static void setSalers(Saler[] salers) {
        CustomDB.salers = salers;
    }

    public static Item[] getItems() {
        return items;
    }

    public static void setItems(Item[] items) {
        CustomDB.items = items;
    }

    public static Orders[] getOrders() {
        return orders;
    }

    public static void setOrders(Orders[] orders) {
        CustomDB.orders = orders;
    }

    public static OrdersDetail[] getOrdersDetails() {
        return ordersDetails;
    }

    public static void setOrdersDetails(OrdersDetail[] ordersDetails) {
        CustomDB.ordersDetails = ordersDetails;
    }
}
