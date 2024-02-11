package com.javastudy.exam.collections.set;

import java.util.HashSet;
import java.util.Set;

public class contains {

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        setA.add(1);        setA.add(2);        setA.add(3);
        setB.add(3);        setB.add(4);        setB.add(5);

        int ans = 0;
        for(int num : setA) { // A에 있고 B에 없는 개수 구하기
            if(!setB.contains(num)) {
                ans += 1;
            }
        }
        System.out.println(ans);

        ans = 0;
        for(int num : setB) { // B에 있고 A에 없는 개수 구하기
            if(!setA.contains(num)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
