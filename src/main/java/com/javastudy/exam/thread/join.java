package com.javastudy.exam.thread;
// join()   join(long millis)    join(long millis, int nanos)
// 지정된 시간동안 특정 스레드가 작업하는 것을 기다린다.
// join() 으로 하면 완전히 끝날때까지 기다린 뒤 다시 진행된다.
public class join {
    static long startTime = 0;
    public static void main(String[] args) {
        // 실행중인 사용자 스레드가 하나도 없을 때 프로그램은 종료된다.
        ThreadEx11_1 th1 = new ThreadEx11_1();
        ThreadEx11_2 th2 = new ThreadEx11_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();
        System.out.print("소요시간:" + (System.currentTimeMillis() - MainThread.startTime));
        try {
            // 스레드1.join(); 여기 스레드에서 스레드1의 작업이 끝날 때 까지 기다린 다음, 끝나면 로직 수행한다.
            th1.join();	// main스레드가 th1의 작업이 끝날 때까지 기다린다. 이게 없으면 th1이 작동하는 사이 main스레드가 끝나고 사라지며, th1스레드만 남는다.
            th2.join();	// main스레드가 th2의 작업이 끝날 때까지 기다린다. 이게 없으면,
//            // System.out.print("소요시간:" + (System.currentTimeMillis() - MainThread.startTime)); 소요시간 출력 글이
//            // 제일 마지막에 출력되지 않고 도중에 출력될 수 있으며, th1 th2와 같이 동작하며 main이 먼저 끝날 수 있기 때문이다.
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
