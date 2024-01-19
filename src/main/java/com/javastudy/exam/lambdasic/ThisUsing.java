package com.javastudy.exam.lambdasic;

public class ThisUsing {
    public static void main(String[] args) {
        ThisInnerClass thisClass = new ThisInnerClass();

        ThisInnerClass.Inner inner = thisClass.new Inner(); // 내부클래스 불러와서 객체생성
        inner.method(); // inner.method()
    }
}
