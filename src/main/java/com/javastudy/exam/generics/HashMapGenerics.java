package com.javastudy.exam.generics;

import java.util.HashMap;

public class HashMapGenerics {
    public static void main(String[] args) {
        // 여려개의 타입변수가 필요한 경우, 콤마(,)를 구분자로 선언해 사용 가능하다.
        // 객체
        HashMap<String, Integer> map1 = new HashMap<>(5);
        HashMap<String, Double> map = new HashMap<>(5);
        HashMap<String, IteratorClass> mapa = new HashMap<>(5);
        HashMap<String, Object> mapo = new HashMap<>(5);

        map.put("가나다", 3.12345); //
        System.out.println(map.get("가나다"));  // value 출력
        System.out.println(map.get("가나다2")); // 없으면 null 반환

        mapa.put("ob1", new IteratorClass("김마리", 3, 12) );
        IteratorClass ob = mapa.get("ob1"); //형변환 없이 get으로 해당 클래스 객체 가져오기 가능

    }
}
