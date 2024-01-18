package com.javastudy.exam.thread;
// yield()는 스래드의 남은 시간을 다음 스레드에게 양보하고, 자신(현재 스레든)는 실행대기 하는 것
// 다른 스레드의 점유율을 높이는 것
public class Yield {
    public static void main(String[] args) {
        YieldNew r = new YieldNew();
        Thread th1 = new Thread(r, "th1*"); // 이건 실제로 YieldNew 형식으로 실행이 안되는거 같다. Thread 참조변수로 받아서 그런듯
//        RunImplNew r2 = new RunImplNew();
        YieldNew th2 = new YieldNew("th2**");
        Thread th3 = new Thread(r, "th3***");
        th1.start();
        th2.start();
//        th3.start();

        try {
            Thread.sleep(3000);
            th2.suspend();	// 쓰레드 th2을 잠시 중단시킨다.
            Thread.sleep(1000);
            th2.resume();	// 쓰레드 t2이 다시 동작하도록 한다.
            Thread.sleep(5000);
            th2.stop();		// 쓰레드 th1을 강제종료시킨다.
//            th2.stop();
//            Thread.sleep(2000);
//            th3.stop();
        } catch (InterruptedException e) {}
    }

}
class YieldNew implements Runnable {
    // suspend, resume, stop 을 사용하기위해 변수와 메서드를 새로 만들어 override준비한다.
    volatile boolean suspended = false;  // volatile 붙이는 이유, 별 기능은 없으며, 매번 값이 자주 바뀌니 복사본 쓰지말고 원본 이것을 가져다 쓰라는 소리로 붙여놓은 것
    //    boolean suspended = false;
    volatile boolean stopped = false;
//    boolean stopped = false;
//boolean sso = suspended; // 복사는되나 비추

    Thread th;
    YieldNew() {super();}
    YieldNew(String name){
        th = new Thread(this, name);
    }
    void start() {
        th.start();
    }
    void stop() {  // 완전 정지
        stopped = true;
        th.interrupt(); // yield위해 추가, run에서 반응속도 조금더 빨라진다고 함.
        System.out.println("stop 동작");
    }
    void suspend() { // 일시 정지
        suspended = true;
        th.yield(); // yield위해 추가?
        System.out.println("suspend 동작");
    }
    void resume() {  // 다시 시작
        suspended = false;
        System.out.println("resume 동작");
    }
    public void run() {
        while(!stopped) {  // 여기 두줄  추가하여 stop, suspended, resume 을 새로 구현한다.
            // stopped true suspended false이면 여기서 계속 반복문돈다 -> 이걸 busywaiting이라고 하는데, 이걸 해결하기위해 yield를 쓴다.
            if (!suspended ) {  // 여기 두줄
                System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름을 찍음
                try {
//                    System.out.println("---");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            } else {

//                System.out.println("yield 동작");
                Thread.yield(); // yield 추가로 다른 스레드에 점유 양보, 그러나 루프는 계속 돌게된다.
                // os 스케줄러한테 통보해주는 것으로 반드시 yeild가 동작한다는 보장은 없다. 그러나 다른 스레드를 위해 양보하므로 suspended일때 조금은 다른스레드의 성능을 증가시킬 수 있다.
            }


        }
    } // run()

}