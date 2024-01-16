package com.javastudy.exam.collections;

import java.util.*;

public class SingletonCollection {
    static List l = new ArrayList<String>(24);
    static List singletonList = Collections.singletonList(l); // 싱글톤 List 생성
    static Set singletonSet = Collections.singleton( Set.copyOf(l)); // 싱글톤 Set 생성
    static Map singletonMap = Collections.singletonMap("key", "value");
    public static void main(String[] args) {
        l.add("0"); l.add("1"); l.add("2"); l.add("3");
        System.out.println(singletonList);
        l.add("44"); l.add("55");
//        singletonList.add("22"); singletonList.add("33"); // 에러, singletonList로 만든건 만들어진 이후 불변한다, 싱글톤 리스트로 추가가 불가능 함.
        System.out.println(singletonList);
        System.out.println(singletonSet);
        System.out.println(singletonMap);
        //한개의 객체만 있는 리스트 반환
        //-변경여부 : immutable (불변)
    }
}
