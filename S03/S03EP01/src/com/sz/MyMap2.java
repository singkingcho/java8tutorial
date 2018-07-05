package com.sz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap2 {


    public static void main(String[] args) {
        Map map = new HashMap();
        //
        map.put("CN","中国");
        map.put("US","美国");
        map.put("EU","欧洲");
        // 遍历
        // get方法是通过键获取值
        System.out.println(map.get("EU"));

        // 得到键的集合，就可以获取所有的值
        // ketSet是所有的键的集合，是一个set，set无序，不重复
        // HashMap当中的key是唯一并且无序
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);
            System.out.println("Key :" + key + ", Value :" + value);
        }

//        map.remove("US");


    }
}




















