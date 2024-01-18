package com.javastudy.exam.thread;

public class ThreadCreate {
    public static void main(String args[]) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

        t1.start();
//        t1.start();  // Exception in thread "main" java.lang.IllegalThreadStateException 연속으로 실행시 에러발생, 하나의 Thread 객체에 start()를 두번 이상 호출을 할 경우 발생한다.
        // 기존에 생성된 쓰레드를 종료시키고 새로운 인스턴스를 만들어서 실행시켜야함.
        t1 = new ThreadEx1_1();
        t1.start();  // start() 할 경우, Os 스케줄러가 실행 순서를 결정, jvm이 독립적으로 실행한다지만, OS의 스케줄러에 의존하는 부분도 없지는 않음. 그러므로 OS 스케줄러에 의해 실행순서 결정됨.
        t2.start();
        // 멀티스레드 , 멀티스레드로 동작하는건 우선순위 없이 계속 돌아가며, 어떤게 먼저 실행될지 모른다.
        //-------------------------------------
        // 싱글스레드 , 싱글스레드로 동작하는건 순서가 적용되어 동작한다.
        for(int i=0; i < 100; i++) {
            System.out.print(3); // 조상인 Thread의 getName()을 호출
        }
        for(int i=0; i < 100; i++) {
            System.out.print(4);
        }

    }
}
// run()을 구현하는게 목적
class ThreadEx1_1 extends Thread {  // 1. Thread클래스를 상속
    public void run() {  // 스레드가 수행할 작업을 작성
        for(int i=0; i < 100; i++) {
//            System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출, 아래와 같은소스
//            System.out.println(getName()); // 조상인 Thread의 getName()을 호출
            System.out.print(0); // 조상인 Thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable { //2. Runnable 인터페이스를 구현
    public void run() { // 스레드가 수행할 작업을 작성
        for(int i=0; i < 100; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
//            System.out.println(Thread.currentThread().getName()); // 스레드를 상속받은게 아니므로, Thread.currentThread()를 이용해서 객체를 참조해 메소드 반환
//            System.out.println(Thread.currentThread().getName());
            System.out.print(1);
        }
    }
}