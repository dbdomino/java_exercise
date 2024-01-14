package com.javastudy.exam.collections.Iterator;

import java.util.*;
// Iterator로 Collection 의 자손들 값 보기 지원
// 다만 Map은 iterator()는 없음.
public class IteratorSample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        HashSet listH = new HashSet();
        listH.add("5");
        listH.add("6");
        listH.add("7");
        listH.add("8");
        listH.add("9");
        TreeSet listT = new TreeSet();
        listT.add(" 9");
        listT.add("10");
        listT.add("11");
        listT.add("12");
        listT.add("13");

        Iterator it = list.iterator();
        // Iterator는 제일 처음인덱스 부터 시작하여 순차적으로 읽어낸다.
        // 일회용이므로, 다시 읽으려면 다시 불러와야 한다.

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
//        it = list.iterator();
//        while(it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }

        int listHsize = listH.size();
        it = listH.iterator();
        // hashset
        for (int i = 0; i < listHsize; i++) {
            Object o = list.get(i);  // list get(i) 가능
//            Object o2 = listH.get(i);  // hashset get(i) 없어서 불가능
            Object o3 = it.next();  // list -> hashset 으로 바꿧지만, Iterator로 불러온건 가능하다.
                                    // Collection의 자식으로 Iterator 지원함.
            System.out.println(o + " "  + " " + o3);
        }
        // TreeSet 도 지원함
        it = listT.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
