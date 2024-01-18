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
        t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
        t.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력한 값은 "+input + " 입니다.");
        t.interrupt();  // 스레드 종료 시전
//        t.isInterrupted(true);

    }
}
class IOblockEX1 extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 10; i > 0; i --) {
            System.out.println(i);;
            try {sleep(1000); } catch (Exception e) {}
        }
    }
}
