package com.javastudy.exam.collections.Iterator;


import java.util.*;

public class IteratorMapSample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Map map = new HashMap();
        map.put("m1","pp1");
        map.put("m2","pp4");
        map.put("m3","pp2");
        map.put("m4","pp3");
        map.put("m5","pp5");

//        Iterator it = map.iterator(); // 에러
        Iterator it = map.keySet().iterator(); // 이런식으로 key 불러오기 가능
         it = map.entrySet().iterator(); // 이런식으로 key=value 불러오기 가능
         it = map.values().iterator(); // 이런식으로 value 불러오기 가능
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
