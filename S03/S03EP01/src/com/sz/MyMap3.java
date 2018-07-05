package com.sz;

import java.util.*;

public class MyMap3 {


    public static void main(String[] args) {
        Map map = new HashMap();
        //
        map.put("CN","中国");
        map.put("US","美国");
        map.put("EU","欧洲");
        // 提供了单独的value的集合
        Collection values = map.values();
        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}




















