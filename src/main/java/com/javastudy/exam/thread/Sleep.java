package com.javastudy.exam.thread;

// 현재 스레드를 지정된 시간동안 멈추게 한다.
// 자기 자신 스레드만 해당됨.(sleep, yield)
public class Sleep {
    public static void main(String[] args) {
        // static void sleep(long millis)  sleep(3000) sleep(3*1000)  //천분의 일초 단위
        // static void sleep(long millis,int nanos)   //천분의 일초 + 나노초 10^-9승
        // 예외처리를 해야하는 메서드 (InterruptedException이 발생하면 깨어남)
        // 깨우는 것 timeUp  interrupted

        try {
            Thread.sleep(1,500000); // 스레드를 0.0015초 동안 멈추게 한다.
        } catch (InterruptedException e) {}
    }
    void delay(long l) {
        try {
            Thread.sleep(l*1000); // l 초 만큼 딜레이시키는 메소드. delay(10) -> 10초 sleep
        } catch (InterruptedException e) {}
    }
}
