package com.javastudy.exam.thread;
// 데몬 스레드(daemon thread)
/*
일반 스레드(non-daemon thread)의 작업을 돕는 보조적인 역할을 수행
- 일반 스레드가 모두 종료되면 자동적으로 종료된다.
- 가비지 컬렉터, 자동 저장, 화면 자동갱신 등에 사용된다.
- 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정 조건이 만족되면 작업을 수행하고 다시 대기하도록 한다.
 */
public class Daemonthread {
    public static void main(String[] args) throws InterruptedException {
        DeamonThreadEx d = new DeamonThreadEx(); // 예제 스레드로 생성
        System.out.println(d.isDaemon()); // boolean isDaemon()    데몬스레드 인지 아닌지 확인해준다.
        d.setDaemon(false); // false로 하면 일반 스레드가 된다. void setDaemon(boolean on)
        System.out.println(d.isDaemon());
        d.setDaemon(true); // ture로 하면 데몬 스레드가 된다.
        System.out.println(d.isDaemon());
        d.start();


    }

}
class DeamonThreadEx extends Thread {
    boolean autoSave = true;
    public void run() {
        try {
            Thread.sleep(3 * 1000); // 3초씩 끊어서 실행
//            Thread.wait(1000); // 3초씩 끊어서 실행

        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if (autoSave) {
            autoSave();
        }
    }
    public void autoSave() {
        System.out.println("자동저장 완료.");
    }
}
