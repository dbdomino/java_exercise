package com.javastudy.exam.singleton;

public class SingletonSync {
    private static SingletonSync uniqueInstance; // 싱글톤 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
//    private static SingletonSync uniqueInstance = new SingletonSync(); // 처음부터 생성할 때 인스턴스를 생성하면 객체가 2개 만들어질 일은없다.
    // 이러면 멀티스레드에서도 문제없다.

    // 기타 인스턴스 변수
    private SingletonSync() {} // 생성자를 private로 선언했으므로, singleton에서만 클래스의 인스턴스를 만들 수 있습니다.

    // 동기화 시킨다면 멀티스레드에서도 동기화가 보장되어 객체가 2개 생성되는 일을 막을 수 있다.
    // 그러나 자원을 많이 먹어 성능이 저하될 수 있다.
    public static synchronized SingletonSync getInstance() { // getInstanse()메소드는 클래스의 인스턴스를 만들어 리턴합니다.
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync(); // 인스턴스가 생성되어있지 않다면 신규로 생성합니다.
        }
        return uniqueInstance; // 인스턴스가 생성되어 있다면 기존의 인스턴스를 리턴합니다.
    }
    // 기타 메소드
    // Singleton 클래스도 보통 클래스입니다. 여기에 다른 인스턴스 변수나 메소드 추가 가능합니다.
}

class SingletonSync2 {
//    private static SingletonSync uniqueInstance; // 싱글톤 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    private static SingletonSync2 uniqueInstance = new SingletonSync2(); // 처음부터 생성할 때 인스턴스를 생성하면 객체가 2개 만들어질 일은없다.
    // 이러면 멀티스레드에서도 문제없다.

    // 기타 인스턴스 변수
    private SingletonSync2() {} // 생성자를 private로 선언했으므로, singleton에서만 클래스의 인스턴스를 만들 수 있습니다.

    // 멀티스레드에서도 synchronized 없이 객체가 2개 이상 만들어질 일은 없다.
    public static SingletonSync2 getInstance() { // getInstanse()메소드는 클래스의 인스턴스를 만들어 리턴합니다.
//        if (uniqueInstance == null) {
//            uniqueInstance = new SingletonSync(); // 인스턴스가 생성되어있지 않다면 신규로 생성합니다.
//        }
        return uniqueInstance; // 인스턴스가 생성되어 있다면 기존의 인스턴스를 리턴합니다.
    }
    // 기타 메소드
    // Singleton 클래스도 보통 클래스입니다. 여기에 다른 인스턴스 변수나 메소드 추가 가능합니다.
}

class SingletonSync3 {
    // volatile 추가
    private volatile static SingletonSync3 uniqueInstance; // 싱글톤 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수

    // 기타 인스턴스 변수
    private SingletonSync3() {} // 생성자를 private로 선언했으므로, singleton에서만 클래스의 인스턴스를 만들 수 있습니다.

    // DCL(Double Checked Locking)을 사용하여 인스턴스가 생성되었는지 확인(1차) 후 생성되지 않은경우 동기화 하여 객체 생성진행.
    // 그러면 처음 호출될 때만 동기화하고 나중에는 동기화 하지 않아도 됨.
    public static SingletonSync3 getInstance() { // getInstanse()메소드는 클래스의 인스턴스를 만들어 리턴합니다.
        if (uniqueInstance == null) {
            synchronized (SingletonSync3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonSync3(); // 인스턴스가 생성되어있지 않다면 신규로 생성합니다.
                }
            }

        }
        return uniqueInstance; // 인스턴스가 생성되어 있다면 기존의 인스턴스를 리턴합니다.
    }
    // 기타 메소드
    // Singleton 클래스도 보통 클래스입니다. 여기에 다른 인스턴스 변수나 메소드 추가 가능합니다.
}
