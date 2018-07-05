package com.sz;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyMap4 {


    public static void main(String[] args) {
        Map map = new HashMap();
        // key可以为null,但是只能有一个，受制于唯一的这个特点。

        map.put("CN","中国");
        map.put("US","美国");
        map.put("EU","欧洲");

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key:" + key + ", value :" + value);
        }

        System.out.println(map.containsKey("CN"));
        System.out.println(map.containsValue("中国"));
        System.out.println(map.size());
        map.put(null,null);
        map.put(null,null);
        System.out.println(map.size());

    }
}




















