package com.javastudy.exam.singleton;
/*
    1. 싱글톤 패턴
싱글톤 패턴이란 클래스의 인스턴스를 하나만 생성하여 사용하는 패턴이다.
주로 특정 객체를 여러곳에서 공유해야 할 때 사용한다.(Ex: DB Conntection pool)
싱글톤 패턴을 이용함으로써 메모리에 인스턴스 하나를 등록해 여러 쓰레드에서 동시에 하나의 객체를 이용할 수 있게 할 수 있다.
이것으로 인해 주의할 점은 여러곳에서 동시에 접근해서 생길 수 있는 문제(동기화 문제)를 잘 파악하고 설계해야한다.

싱글톤 패턴을 만들땐 기본적으로 생성자를 private로 해서 외부에서는 직접 인스턴스를 생성할 수 없게 하고, 사용자에게 인스턴스를 전달하는 static 메소드가 있다. 아래 예제를 보자.

아래 예제를 보면 객체는 오로지 getInstance()를 통해서만 생성되거나 얻을 수 있다. 이로인해 예제 출력을 해도 1이 두번 출력된다.
     */
public class SingletonPatternEx {
    private static SingletonPatternEx instance;
    private SingletonPatternEx() {} //생성자에 접근 x
    private SingletonPatternEx(int lvn) {ivn=lvn;} //생성자에 접근 x
    private int ivn;
    public static SingletonPatternEx getInstance() {
        return instance;
    }
    public static SingletonPatternEx getInstance(int lvn) {
        if (instance == null) {
            instance = new SingletonPatternEx(lvn);
        }
        return instance;
    }

    // 블록생성자, static block을 통해 클래스가 처음 로딩 될때 객체를 생성
    static {
        try {
            instance = new SingletonPatternEx();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public void hello() {
        System.out.println("hellow!!world!!");
    }
    public int getNumber() {
        return ivn;
    }
}
