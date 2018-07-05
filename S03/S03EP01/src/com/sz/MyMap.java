package com.sz;

import java.util.HashMap;
import java.util.Map;

public class MyMap {


    public static void main(String[] args) {
        Map map = new HashMap();
        //
        map.put("CN","中国");
        map.put("US","美国");
        map.put("EU","欧洲");
        // LCS EU LCS NA
        System.out.println(map.size());
        map.remove("US");
        System.out.println(map.size());
        // twitch


    }
}




















