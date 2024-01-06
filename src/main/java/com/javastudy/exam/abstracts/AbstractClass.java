package com.javastudy.exam.abstracts;
// 추상클래스

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); // 추상메소드,
    void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load()   { /* 선택된 대상을 태운다. */ }
    void unload() { /* 선택된 대상을 내린다. */ }
}
public class AbstractClass {
    public static void main(String[] args) {
//        Unit[] group = {new Marine(), new Tank(), new Dropship()}; // 아래 4줄이랑 같은역할
        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();

        // group 배열의 참조변수는 모두 Unit형이다. 참조하는 객체는 다다르다.
        // 다형성으로 이걸 지원가능하다.
        group[0].move(140, 280); // Marine 객체의 move() 사용
        group[1].move(140, 280); // Tank 객체의 move() 사용
        group[2].move(140, 280); // Dropship 객체의 move() 사용

    }
}
