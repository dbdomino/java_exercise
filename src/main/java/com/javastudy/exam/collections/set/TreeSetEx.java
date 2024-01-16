package com.javastudy.exam.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Comparator cc = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0; // 음수면 내림차순, 양수면 오름차순
            }
        };
        TreeSet set = new TreeSet();
        TreeSet set2 = new TreeSet(cc); //주어진 정렬 기준으로 treeSet 생성

        for (int i = 4; set.size() < 25; i++){
            set.add(i);
        }
        set2.addAll(set);
        set2.add(set);
        System.out.println(set);
        System.out.println(set2);

        TreeSet treeStr = new TreeSet();

        String from = "b";
//        String to	= "d";
        String to	= "zzzzz";

        treeStr.add("abc");      treeStr.add("alien");    treeStr.add("bat");
        treeStr.add("car");      treeStr.add("Car");      treeStr.add("disc");
        treeStr.add("dance");    treeStr.add("dZZZZ");    treeStr.add("dzzzz");
        treeStr.add("elephant"); treeStr.add("elevator"); treeStr.add("fan");
        treeStr.add("flower"); treeStr.add("zz"); treeStr.add("zzzz");  treeStr.add("ZZz");

        System.out.println(treeStr);
        System.out.println("range search : from " + from  +" to "+ to);
        System.out.println("result1 : " + treeStr.subSet(from, to)); // from 단어와 to 단어 사이의 값을 찾는데 사용(끝은 포함안되어 to가 d라면 c까지 검색, subSet
        System.out.println("result2 : " + treeStr.subSet(from, to + "z")); // to를 z까지 포함시키려면? 어렵다, 그러므로 트리셋은 숫자저장을 하는게 유리하다.
        // 굳이 문자로 하려면, 대문자 또는 소문자로 통일해서 넣어야한다. from 소문자 to 대문자이면 에러난다.
    }
}
