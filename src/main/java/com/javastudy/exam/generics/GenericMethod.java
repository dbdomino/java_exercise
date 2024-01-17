package com.javastudy.exam.generics;

import java.util.ArrayList;
import java.util.List;

// 제네릭 타입이 선언된 메서드(타입 변수는 메서드 내에서만 유효), 메서드 단계에서 제네릭타입으로 반환하거나 매개변수로 쓰이는 것
//class Fruit<T> {
//   static <T> void sort(List<T> list, Comparator<? super T> c) { .... }  // 여기서 클래스의 <T>와 메서드에 붙은<T>는 다른 것이며,
//   메서드에 붙은 <T>가 우선시 되어 사용 된다.
// }
public class GenericMethod {
    public static void main(String[] args) {
        Student2<Integer> s2 = new Student2<>();
        List<String> l = new ArrayList<>();
        l.add("one");
        l.add("three");
        l.add("five");
        System.out.println(s2.getOneStudent(2.45)); // 제네릭 메소드의 제네릭은 매개변수를 통해 등록된다.
        System.out.println(s2.getOneStudent(l )); // 제네릭 메소드의 제네릭은 매개변수를 통해 등록된다.
        System.out.println(Student2.getOneStudent(l )); // 제네릭 메소드는 static으로 선언, 실행 가능하다. 클래스의 제네릭 T에 영향받지 않기 때문
    }
}
class Student<T> {  // 제네릭 클래스
    T getName(T name) { // 일반 메소드
        return name;
    }
}
class Student2<T> {
    <T> T getOneStudent(T id) {
        return id;
    }
    static <T> List<T> getOneStudent(List<T> id) {
        return id;
    }
}
