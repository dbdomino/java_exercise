package com.javastudy.exam.generics;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorClass {
    String name = "";
    int ban;
    int no;

    IteratorClass(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
public class IteratorExGenerics {

        public static void main(String[] args) {
            ArrayList<IteratorClass> list = new ArrayList<IteratorClass>();
            list.add(new IteratorClass("김자반", 1, 1));
            list.add(new IteratorClass("소세지", 1, 2));
            list.add(new IteratorClass("떡볶이", 2, 1));

            Iterator<IteratorClass> it = list.iterator();
            while (it.hasNext()) {
                //  Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
                IteratorClass s = it.next(); // ArrayList<Student> 이런식으로 미리 매개변수타입 선언해 둬서
                                        // it.next()로 형변환 없이 Students 객체로 받아올 수 있다.
                System.out.println(s.name);
            }
        } // main
}
