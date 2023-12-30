package com.javastudy.exam.statics;

public class StaticClassCreate {
    public static void main(String[] args) {
        Obj1 obj1 = new Obj1(); // 인스턴스 생성
        System.out.println("obj1 : "+obj1); // 주소값
        System.out.println("obj1 : "+obj1.a); // obj1.의 a값, 별도지정 없어서 초기값 0으로 세팅됨
        System.out.println("obj1 : "+obj1.b); // obj1.의 b값, static, 별도지정 없어서 초기값 0으로 세팅됨
//        System.out.println("obj1 : "+obj1.c); // obj1.의 c값, 에러

    }
}
class Obj1 {
    int a; // 인스턴스 변수, 클래스 영역에 선언, 클래스가 메모리에 올라갈 때 생성됨
    static int b; // 클래스 변수 (static 변수)
    void method(){
        int c; // 메소드 내 지역변수
    }
}