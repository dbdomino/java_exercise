package com.javastudy.exam.objectoriented;

// 메소드에서 지역변수는 수동 초기화 해야 사용가능함.
class InitTest{
    int x; // 인스턴스 변수
    int y = x; // 인스턴스 변수

    //


    // 멤버변수( 인스턴스변수 iv, static 변수 cv) 의 초기화
    // - 자동초기화, 멤버변수는 자동 초기화 됨/*
    /*
    boolean     false
    char        '\u0000'
    byte short int 0
    long 0L
    float 0.0f
    double 0.0 0.0d
    참조형 null
  */
    // - 명시적 초기화, 하나씩 = (대입연산자) 붙여서 초기화 하는 것
        int dooro = 4;

    // - 초기화 블럭 {} 대괄호 안에 여러 라인 넣어서 초기화 하는 것, static {} cv일 경우
    static { int c = 2;}
    { int d = 3;}
    InitTest(String a) { //
        int door = 4;
        AAA e = new AAA();
    }



    void method1() {
        int i; // 지역변수
//        int j = i; // 컴파일에러, 지역변수 초기화가 불가능, 자동 초기화 지원안되서 에러남.
    }
}
class AAA {}

public class ParamInitialize {

}
