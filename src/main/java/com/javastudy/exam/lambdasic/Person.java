package com.javastudy.exam.lambdasic;

public class Person {
    public void action(Calcuable calcuable) {  // 매개변수에 함수형, 람다식이 들어가면 action이 동작한다 그소리네.
        double result = calcuable.calc(10, 4);
        System.out.println("결과 : "+ result);

    }
}

//@FunctionalInterface // 이거없어도 동작은 함
@FunctionalInterface
interface Calcuable { // 함수형 인터페이스 Calcuable 선언
    double calc(double x, double y);  // 추상메소드
}
