package com.javastudy.exam.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 한가지 타입의 객체만 저장하기
public class CheckedCollection {
    static List l = new ArrayList<String>(24);
    static List cl = Collections.checkedList(l, String.class); // 스트링 형식의 list만 받겠다는소리
    public static void main(String[] args) {
        cl.add("호호");
        System.out.println(cl);
        cl.add("자장");
        System.out.println(cl); // [호호, 자장]
        System.out.println(l);  // [호호, 자장] 실제 저장은 l에 되며, cl을 통해서 지정된 클래스타입만 저장되도록 해줌.
        // 요즘은 제네릭스로 클래스타입 미리 체크 하므로 잘 쓰지 않는다. 1.5버전 이전에 쓰던 기능이나 호환성을 위해 남은 기능
    }
}
