package com.javastudy.exam.collections.set;

import java.util.*;

// set 순서 x , 중복 x
public class HashSetRandom {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }

        System.out.println(set); // set 출력,

        // set을 list로 가능 순서 o, 중복 o
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
