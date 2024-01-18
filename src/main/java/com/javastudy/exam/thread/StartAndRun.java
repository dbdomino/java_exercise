package com.javastudy.exam.thread;
// start()와 run() 차이가 뭘까?

public class StartAndRun {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();  // 1. 스레드 생성
        t1.start();  // 2. 스래드 실행

    }
}
class ThreadTest extends Thread {  //
    public void run() {  // 3. 스래드 run
        for(int i=0; i < 100; i++) {
//            System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출, 아래와 같은소스
//            System.out.println(getName()); // 조상인 Thread의 getName()을 호출
            System.out.print(0); // 조상인 Thread의 getName()을 호출
        }
    }
}
