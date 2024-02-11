package com.javastudy.exam.collections.map;

import java.util.HashMap;
import java.util.Map;

public class getOrDefault {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String name = "name2";

        map.put("name1", 1);
        map.put("name2", 1);
        map.put("name2", map.getOrDefault("name2",0) +  1);
        map.put("name3", map.getOrDefault("name3",0) +  1);

        for(String key : map.keySet()) { // 듣도못한사람
            System.out.println("key: "+key+" , value: " + map.get(key));
        }

    }
}
