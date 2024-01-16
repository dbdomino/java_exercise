package com.javastudy.exam.collections.set;

import java.util.*;

// set 순서 x , 중복 x
public class HashSetRandom {
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set.size());

        try {
            for (int i = 0; set.size() < 6; i++) {
                int num = (int) (Math.random() *6) + 1; // 반복개수 6개 될때까지 무한루프 돈다.
                set.add(num);
            }
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        set.add(11);
        System.out.println(set); // set 출력, 순서x 중복 x

        // set을 list로 가능 순서 o, 중복 o
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
