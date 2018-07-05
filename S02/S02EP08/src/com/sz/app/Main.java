package com.sz.app;

import com.sz.biz.HungryHorseBiz;
import com.sz.biz.impl.HungryHorseBizImpl;
import com.sz.db.CustomDB;
import com.sz.model.Item;
import com.sz.model.Saler;

public class Main {


    /**
     * 自行构造点数据
     * @param args
     */
    static{
        init();
    }

    private static void init() {

        // 先初始化商品
        Item[] items = new Item[3];
        items[0] = new Item();
        items[1] = new Item();
        items[2] = new Item();
        items[0].setIid("S00012312312312");
        items[0].setName("果粒多");
        items[0].setPrice(6);
        items[0].setUnit("瓶");

        items[1].setIid("S00012312312313");
        items[1].setName("排骨");
        items[1].setPrice(23);
        items[1].setUnit("斤");

        items[2].setIid("S00012312312314");
        items[2].setName("中华");
        items[2].setPrice(75);
        items[2].setUnit("包");



        Saler[] salers = new Saler[5];

        for(int i = 0 ; i < salers.length ;i ++){
            salers[i] = new Saler();
            salers[i].setAddress("华强北" + i + "路");
            salers[i].setName("刘老板的" + i + "店");
            salers[i].setPhone(1382323111+"" + i);
            salers[i].setSid("s000" + i);
        }

        Item[] is = new Item[1];
        is[0] = items[1];
        salers[0].setItems(is);

        Item[] is2 = new Item[2];
        is2[0] = items[1];
        is2[1] = items[0];
        salers[1].setItems(is2);

        Item[] is3 = new Item[3];
        is3[0] = items[1];
        is3[1] = items[0];
        is3[2] = items[2];
        salers[2].setItems(is3);

        Item[] is4 = new Item[1];
        is4[0] = items[2];
        salers[3].setItems(is4);

        Item[] is5 = new Item[2];
        is5[0] = items[2];
        is5[1] = items[0];
        salers[4].setItems(is5);

        CustomDB.setSalers(salers);

    }


    public static void main(String[] args) {
        HungryHorseBiz hhb = new HungryHorseBizImpl();
        hhb.welcome();

    }


}
