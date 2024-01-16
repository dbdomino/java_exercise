package com.javastudy.exam.singleton;

public class SingletonOld {
    private static SingletonOld uniqueInstance; // 싱글톤 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    // 기타 인스턴스 변수
    private SingletonOld() {} // 생성자를 private로 선언했으므로, singleton에서만 클래스의 인스턴스를 만들 수 있습니다.

    public static SingletonOld getInstance() { // getInstanse()메소드는 클래스의 인스턴스를 만들어 리턴합니다.
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonOld(); // 인스턴스가 생성되어있지 않다면 신규로 생성합니다.
        }
        return uniqueInstance; // 인스턴스가 생성되어 있다면 기존의 인스턴스를 리턴합니다.
    }
    // 기타 메소드
    // Singleton 클래스도 보통 클래스입니다. 여기에 다른 인스턴스 변수나 메소드 추가 가능합니다.
}
