package com.javastudy.exam.Interface;

// 인터페이스, 추상 메서드의 집합(추상 메서드들이 모인 설계도, static 변수는 들어갈 수 있으나 나머지 멤버변수는 불가능)
public interface InterfaceSample01 extends Movable, Attackable{ // 인터페이스는 충돌해도 문제없어서, 2개이상 다중상속이 허용됨.
    public static final int SPADE = 4; // 변수는 오직 상수만 넣을 수 있음.
}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit t); // Unit 추상클래스
}
