package com.javastudy.exam.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
//        List list2 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(7);
        list1.add(2);
        list1.add(9);
        list1.add(1);
        list1.add(7);

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 4, 7, 2 들어감
        print(list1, list2);

//        list1.sort();
        Collections.sort(list1);	// list1과 list2를 정렬한다.
        Collections.sort(list2);	// Collections.sort(List l), 해깔리지말자 Collection인터페이스와 다른
                                    // Collections클래스(라이브러리)를 쓰는 것.
        print(list1, list2);

        System.out.println("list1.containsAll(list2):"
                + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i= list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
