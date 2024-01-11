package com.javastudy.exam.Interface;

public interface DefaultMethod {
    // 추상 메서드
    void abstractMethodA();
    void abstractMethodB();
    void abstractMethodC();

    // default 메서드
    // 인터페이스에서 추상메서드가 아닌, 구현부가 있는 메서드를 작성할 때 사용. 앞에 default 예약어를 붙인다.
    // 객체지향 설계 5대원칙 중 하나인 확장을 개방/변경을 폐쇄하는 원칙(OCP open/closed principle)을 적용하기위해 추가된 개념,
    // 인터페이스에 메서드 추가한다고, 모든 구현체에 overriding 할 필요가 없음.
    // 즉, 기존의 구현체들 변경 없이 원하는 기능을 넣을 수 있게됨.
    // 그러나 문제가 있음 (default method 간의 충돌)
    /*
        1. 여러 인터페이스의 디폴트 메서드 간의 충돌
        2. 디폴트 메서드와 상위 클래스(extends된)의 메서드 간의 충돌
     */
    default int defaultMethodA(){
        System.out.println( " DefaultMethod defaultMethodA ");
    	return 1;
    }
}
