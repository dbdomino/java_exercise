package com.javastudy.exam.statics;

public class StaticClassCreate2 {

    static Obj2 obj2 = new Obj2(); // static 인스턴스 생성
    public static Obj2 obj3 = new Obj2(); // static 인스턴스 생성

    public static void main(String[] args) {
        Obj1 obj1 = new Obj1(); // 인스턴스 생성
//        public static Obj2 obj3 = new Obj2(); // main에서 static 인스턴스 생성시 에러남.
        System.out.println("obj1 : "+obj1); // 주소값
        System.out.println("obj1 : "+obj1.a); // obj1.의 a값, 별도지정 없어서 초기값 0으로 세팅됨
        System.out.println("obj1 : "+obj1.b); // obj1.의 b값, static, 별도지정 없어서 초기값 0으로 세팅됨
        System.out.println("obj3 : "+obj3); // obj3.의 b값, static, 별도지정 없어서 초기값 0으로 세팅됨
        System.out.println("obj3 : "+obj3.a); // obj3.의 b값, static, 별도지정 없어서 초기값 0으로 세팅됨
        System.out.println("obj3 : "+obj3.b); // obj3.의 b값, static, 별도지정 없어서 초기값 0으로 세팅됨
//        System.out.println("obj1 : "+obj1.c); // obj1.의 c값, 에러

    }

    // static 클래스를 선언하려면, class 내부에서 선언시키고
//    class Obj2 { static class로 정의하지 않으면, static 인스턴스로 생성 불가능, 5, 6라인에서 에러남
    static class Obj2 {
        int a; // 인스턴스 변수, 클래스 영역에 선언, 클래스가 메모리에 올라갈 때 생성됨
        static int b; // 클래스 변수 (static 변수)
        void method(){
            int c; // 메소드 내 지역변수
        }
    }
}
//class Obj1 { // StaticClassCreate에 같은 클래스 있다고 에러뜸
