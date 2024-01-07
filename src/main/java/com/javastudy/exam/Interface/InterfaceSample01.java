package com.javastudy.exam.Interface;

// 인터페이스, 추상 메서드의 집합
// (추상 메서드들이 모인 설계도, static 변수는 들어갈 수 있으나 나머지 멤버변수는 불가능)
public interface InterfaceSample01 extends Movable, Attackable{ // 인터페이스는 충돌해도 문제없어서, 2개이상 다중상속이 허용됨.
    public static final int SPADE = 4; // 변수는 오직 상수만 넣을 수 있음.
//    static void dance(); // 스태틱 메소드 인터페이스에 추가하려면 구현한 채로 넣어야된다.
    public static void dance() {System.out.println("춤춰춤춰");}; // 스태틱 메소드 인터페이스에 추가하려면 구현한 채로 넣어야된다.

}

interface Movable {
    void move(int x, int y); // 추상메소드
//    abstract void move(int x, int y); // 추상메소드, interface에선 abstract 생략가능
//    public void move(int x, int y); // 추상메소드, interface에선 public 생략가능
}

interface Attackable {
    void attack(Unit t); // Unit 추상클래스
}
