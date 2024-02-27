package com.javastudy.exam.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapOf {
    public static void main(String[] args) {
        // java 9부터 도입된 Map.of  ImmutableCollections  만듬
        Map m = Map.of("a1", 2, "a3", 4, "a5", 6);
        Map m2 = new HashMap();
        m2.put("a1", 2);
        m2.put("a3", 4);
        m2.put("a5", 6);
        // map을 새로 만드는 방법이다.
        System.out.println(m.getClass()); // class java.util.ImmutableCollections$MapN
        System.out.println(m.toString());
        System.out.println(m2.getClass()); // class java.util.HashMap
        System.out.println(m2.toString());

        System.out.println("=--------=");
//        m.put("a1", 77); // 에러 , 변경안됨
        System.out.println(m.toString());

    }
}
