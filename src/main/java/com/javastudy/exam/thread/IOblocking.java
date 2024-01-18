package com.javastudy.exam.thread;

import javax.swing.*;

// 스레드의 I/O블락킹(blocking)   Input/Output 의 작업중단을 I/O blocking 이라고 한다.
public class IOblocking  {

    public static void main(String[] args) {
//        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
//        System.out.println("입력한 값은 "+input + " 입니다.");
//        // A작업
//        // -----------------------------------
//        // B작업, A작업이 일어나기 전에는 계속 대기상태
//        for (int i = 10; i >0; i--) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println("thred sleep exception.");
//            }
//        }

        // 위 작업을 멀티스레드로 변환

        Thread t = new Thread(new IOblockEX1());
        IOblockEX1 t2 = new IOblockEX1();
        t2.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다. 데몬스레드로 설정, 메인메소드 종료되면 자동으로 데몬스레드도 종료됨.
        t2.start();
//        t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다. 데몬스레드로 설정, 메인메소드 종료되면 자동으로 데몬스레드도 종료됨
//        t.start();	// 이 부분이 없으면 종료되지 않는다. 데몬스레드로 설정, 메인메소드 종료되면 자동으로 데몬스레드도 종료됨


        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        t2.loopOn(false); // 이런식으로 데몬스레드를 수동으로 종료시키기 위해 무한루프를 스위치로 종료시키는 방법도 있다.
        System.out.println("입력한 값은 "+input + " 입니다.");

        String input3 = JOptionPane.showInputDialog("아무값이나 입력하세요.2");
    }
}
class IOblockEX1 extends Thread {
    private boolean IOblockEX1_loop = true;   //stop플래그
    @Override
    public void run() { //
//        super.run();
        int i = 10;
        while (IOblockEX1_loop){ // 무한루프
            System.out.println(i);;
            try {sleep(1000); } catch (Exception e) {}
            i--;
        }
        System.out.println("자원 정리");
        System.out.println("IOblockEX1 실행 종료");
    }
    public void loopOn(boolean t) {
        IOblockEX1_loop = t;
    }
}
