package com.javastudy.exam.generics;

import java.util.ArrayList;

public class GenericsEx2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add(20);
        list.add("30");

        Integer i = (Integer)list.get(20); // 형변환해서 쓰기가능
        int ii = (int)list.get(20); // 형변환해서 쓰기가능
//        int iii = list.get(2); // 형변환해서 써야하며 자동으로 형변환이 안됨. list.get(2)
        System.out.println(ii);
    }
}
