package com.javastudy.exam.thread;
// suspend()   resume()   stop()
// 스레드 일시정지, 재개      완전정지
// dead-lock 서로다른 스레드가 각자 필요한 자원을 가지고있어 교착상태인 상태
// deprecated 된 메서드들이므로 사용권장하지 않는다. 교착상태에 빠지기 쉽기 때문
public class Suspend {
    public static void main(String args[]) {
        RunImplOld r = new RunImplOld();
        Thread th1 = new Thread(r, "th1*");
//        RunImplNew r2 = new RunImplNew();
        RunImplNew th2 = new RunImplNew("th2**");
        Thread th3 = new Thread(r, "th3***");
//        th1.start();
        th2.start();
//        th3.start();

        try {
//            Thread.sleep(2000);
//            th1.suspend();	// 쓰레드 th1을 잠시 중단시킨다.
//            Thread.sleep(2000);
//            th1.resume();	// 쓰레드 th1이 다시 동작하도록 한다.
//            Thread.sleep(3000);
//            th1.stop();		// 쓰레드 th1을 강제종료시킨다.
            Thread.sleep(4000);
            th2.suspend();	// 쓰레드 th2을 잠시 중단시킨다.
            Thread.sleep(4000);
            th2.resume();	// 쓰레드 t2이 다시 동작하도록 한다.
            Thread.sleep(5000);
            th2.stop();		// 쓰레드 th1을 강제종료시킨다.
//            th2.stop();
//            Thread.sleep(2000);
//            th3.stop();
        } catch (InterruptedException e) {}
    } // main
}

class RunImplOld implements Runnable {
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름을 찍음
            try {
                System.out.println("---");
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    } // run()
}
class RunImplNew implements Runnable {
    // suspend, resume, stop 을 사용하기위해 변수와 메서드를 새로 만들어 override준비한다.
    volatile boolean suspended = false;  // volatile 붙이는 이유, 별 기능은 없으며, 매번 값이 자주 바뀌니 복사본 쓰지말고 원본 이것을 가져다 쓰라는 소리로 붙여놓은 것
//    boolean suspended = false;
    volatile boolean stopped = false;
//    boolean stopped = false;
//boolean sso = suspended; // 복사는되나 비추

    Thread th;
    RunImplNew() {super();}
    RunImplNew(String name){
        th = new Thread(this, name);
    }
    void start() {
        th.start();
    }
    void stop() {  // 완전 정지
        System.out.println(suspended);

        stopped = true;
        System.out.println("stop 동작");
    }
    void suspend() { // 일시 정지
        suspended = true;
        System.out.println("suspend 동작");
    }
    void resume() {  // 다시 시작
        suspended = false;
        System.out.println("resume 동작");
        System.out.println(suspended);
    }
    public void run() {
        while(!stopped) {  // 여기 두줄  추가하여 stop, suspended, resume 을 새로 구현한다.

            if (!suspended) {  // 여기 두줄
                System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름을 찍음

            }
            try {
                System.out.println("---");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    } // run()
}