package com.javastudy.exam.annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

// 자바에서 제공하는 어노테이션 테스트
public class AnnotationTest {
    public static void main(String[] args) {
        Chile c = new Chile();
        c.parentMethod();  // @Deprecated 덕에 경고 뜸
    }
}
class Parent {
    void parentMethod() {}
}
class Chile extends Parent {
    @Override
    @Deprecated
    @SuppressWarnings("deprecation") // 경고를 확인했고 더이상 띄우지 않겠다는 선언,
    void parentMethod() {}
//    void parentMethod() {}
}
@FunctionalInterface  // 함수형 인터페이스라고 선언, 추상메서드 1개만 있어야 함.
interface Testable {
    @SuppressWarnings("unchecked") // 경고를 확인했고 더이상 띄우지 않겠다는 선언,
    void test(); // 추상메서드
//    void test2(); // 추상메서드
}


