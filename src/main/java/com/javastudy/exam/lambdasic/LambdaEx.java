package com.javastudy.exam.lambdasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface FunctionalInterfaceMethod { // 매개변수가 있고 리턴값이 있는 람다식
    public int method(int x, int y);
}
@FunctionalInterface
interface FunctionalInterfaceVoidMethod { // 매개변수가 있고 리턴값이 없는 람다식
    public void method(int x, int y);
}
@FunctionalInterface
interface FunctionalInterfaceVoidNoneMethod { // 매개변수가 없고 리턴값이 없는 람다식
    public void method();
}


public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 람다식 은 함수적 인터페이스와 연동하여 써야한다.
        // 함수적인터페이스 변수 = 람다식 ;
        FunctionalInterfaceMethod in;
        in = (x, y) -> {  // FunctionalInterfaceMethod 는 함수형 인터페이스로 추상메서드1개가 method(x, y) 형태를 띤다, 이를 실행하면 머가 구현될지를 람다식으로 적은것.
            int result = x + y;
            return result;
        };
        System.out.println(in.method(2, 5));
//        in = (x) -> {  // FunctionalInterfaceMethod 는 매개변수가 있고 리턴값이 있는 람다식으로, 선언시에도 매개변수 개수나 리턴유무가 맞아야한다.
//            int result = x *x;
//            return result;
//        };
//        in = (x, t) -> {  // FunctionalInterfaceMethod 는 매개변수가 있고 리턴값이 있는 람다식으로, 선언시에도 매개변수 개수나 리턴유무가 맞아야한다.
//            int result = x * t;
//
//        };
        System.out.println(in.method(2, 5));



//        int fi = (x) -> {
//            int result = x + x;
//            return result;
//        };
//        System.out.println(fi.(2));


        int x = 1;
//        int y = 5;
//        int o = (x, y) -> { return x + y; };
//        int oo = a -> {System.out.println(a); };
//        int ooo = a -> (x, y) -> x + y;

        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("김치맨", 82)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s -> {   // 람다식으로 함수형
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
