package com.javastudy.exam.Interface;
// 인터페이스를 구현하여 클래스를 만들자.
// 인터페이스는 구현시키기 위해 implements 를 쓴다.
/*
class 클래스이름 implements 인터페이스이름 {
    // 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
}
 */

// 추상 클래스 때 처럼 미구현 된 기능을 구현해주자.
// 그런데, 인터페이스에 미구현된 기능이 없는데도 아래가 에러가 뜬다.
//public class InterfaceCreateObject implements InterfaceSample01{
//
//}
class Sample01 implements InterfaceSample01 {

    // Movable 인터페이스를 상속받은 InterfaceSample01 인터페이스를 implements 해온 거라 구현 해줘야 함.
//    @Override // @Override 생략하고 사용 가능
    public void move(int x, int y) {
        System.out.println("Sample01, x:"+x+", y:"+y);
    }
    // Attackable 인터페이스를 상속받은 InterfaceSample01 인터페이스를 implements 해온 거라 구현 해줘야 함.
    @Override
    public void attack(Unit t) {

    }

}

public class InterfaceCreateObject  {
    public static void main(String[] args) {
        Sample01 s1 = new Sample01();
        s1.move(101, 202);
//        s1.dance(); // 에러, 인터페이스에 구현된 static 메서드는 객체로 선언시키지 않는다.
        InterfaceSample01.dance(); // 인터페이스명으로 직접 static 호출가능, java 1.8부터 가능

    }

}
