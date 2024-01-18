package com.javastudy.exam.thread;

import javax.swing.*;

// interrupt()
// 대기 상태(waiting)인 스레드를 실행대기 상태(RUNNABLE) 로 만든다.
/*
    void    interrupt()     스레드의 interrupted상태를 false에서 true로 변경;.
    boolean isInterrupted() 스레드의 interrupted상태를 반환
    static boolean interrupted() 현재 스레드의 interrupted상태를 알려주고, false로 초기화
 */
// 정해진 패턴같은거라, 작업을 멈추게 하고 싶으면 thread에 반복에서 isInterrupted()를 조건으로 주고 확인하는 로직을 짜서 구현하면 된다.
public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        t.sleep(1000);
        System.out.println(t.isInterrupted()); // 기본값으로 false
        t.sleep(1000);
        t.interrupt();
        System.out.println(t.isInterrupted()); // true
        t.sleep(1000);

        System.out.println(t.interrupted()); // flase -> 안됨. 현재 스레드의 interrupted상태를 알려주고, false로 초기화
        System.out.println(Thread.interrupted()); // flase -> 안됨. 현재 스레드의 interrupted상태를 알려주고, false로 초기화
        t.sleep(1000);
        System.out.println(t.isInterrupted()); // true  한번 interrupt() 호출하면 계속 true인건가?
        // main스레드가 interrupt 되었는지 확인하는 소스
        t.sleep(5000);
        System.out.println(Thread.interrupted());// false   t가 false로 초기화 되진 않는다. 실제로 여기서 동작하는 스레드는 main이며, 자기자신을 조정하는것만 가능하다.
        System.out.println(t.interrupted());// false   interrupted()는 static 메소드다.
        // static 메서드라서 Thread.isInterrupted() 만 수행가능하며, 자기자신 main의 interrupt초기화만 가능하기에, t.interrupted()를 쓰려해도 동작안하며 이처럼 경고 나온다. Static member 'java.lang.Thread.interrupted()' accessed via instance reference
        // 때문에 t.interrupted() 를 해줘도 계속 false 뜨며 interrupt 상태가 초기화 안되는 것이다.
        // t의 interrupt()로 false에서 true로만 바꾸는게 가능하다.
//        t.sleep(1000);
        System.out.println(t.isInterrupted()); // true   interrupt() 호출하면 계속 true인건가?
        System.out.println("-----------------"); //

        ThreadExCount th1 = new ThreadExCount();
        th1.start();
        System.out.println(th1.interrupted());  // false
        th1.sleep(1000);
        System.out.println("isInterrupted():"+ th1.isInterrupted()); // false
        th1.sleep(1000);
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();  // interrupt()를 호출하면, interrupted상태가 true가 된다.
        System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
    }
}
class ThreadExCount extends Thread {
    public void run() {
        int i = 10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0;x<2500000000L;x++); // 시간 지연
        }

        System.out.println(this.isInterrupted()); // true   현재 interrupt 상태
        System.out.println(Thread.interrupted());// true    false로 초기화하기/ 초기화 실패하면 false 반환, 애초에 false이면 false반환함
//        t.sleep(1000);
        System.out.println(this.isInterrupted()); // false  interrupt 상태 false로 초기화됨

        System.out.println("카운트가 종료되었습니다.");
    }
}