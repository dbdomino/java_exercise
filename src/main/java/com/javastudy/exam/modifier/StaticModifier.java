package com.javastudy.exam.modifier;

class StaticTest {
    static int width =200;
    static int height =120;
    static { // 클래스 초기화 블럭
        // static변수의 복잡한 초기화 수행
    }
    static int max(int a, int b) {
        return a > b ? a : b;  //static 메소드는 객체를 필요로하는 멤버변수, 인스턴스 메소드는 사용불가능
    }
}
public class StaticModifier {
}
