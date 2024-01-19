package com.javastudy.exam.lambdasic;

public class ThisInnerClass {
    public int outterField = 11;
    public int field = 11;

    class Inner {
        int innerField = 22;
        int field = 22;

        void method() {
            FunctionalInterfaceVoidNoneMethod fi = () -> {  // 매개변수없고 리턴도없는 함수형 인터페이스, 람다식으로 구현
                System.out.println("outterField : " + outterField);
                System.out.println("innerField : " + innerField);
                System.out.println("fieldo : " + ThisInnerClass.this.field); //밖의 field, ThisInnerClass.this는 외부의 ThisInnerClass 를 가리킨다.
                System.out.println("fieldi : " + this.field); //로컬의 field, 그냥 this 붙이면 inner의 this가 된다.
                System.out.println("fieldi : " + field); //로컬의 field
            };
            fi.method(); // 람다식으로 구현된 함수형 인터페이스 실행. fi.method()
        }
    }
}
