package com.javastudy.exam.thread;
// 스레드 우선순위
public class PriorityOfThread {
    public static void main(String args[]) {
        ThreadExLLL th1 = new ThreadExLLL();
        ThreadExOOO th2 = new ThreadExOOO();

        th1.setPriority(3);
//        th2.setPriority(7);
        th2.setPriority(9);  // 우선순위가 높다고 해도, 반드시 일찍 끝난다는 보장은 없다.
        // 그러나 확률적으로는 빨리 끝날 확률이 높다.
        // 이런걸 스레드의 불확실성 이라고 한다.
        // 그럼에도 우선순위가 높은 작업이라면 설정 해주는게 좋을것이다.
        // 윈도우에서도 프로세스당 우선순위 설정 가능

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}

class ThreadExLLL extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("L");
            for(int x=0; x < 10000000; x++);
        }
    }
}

class ThreadExOOO extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("O");
            for(int x=0; x < 10000000; x++);
        }
    }
}

