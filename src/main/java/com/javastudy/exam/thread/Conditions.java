package com.javastudy.exam.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// notify의 문제점, wait로 waiting pool에 들어간 스래드를 무작위하게 하나 깨운다는 것이다.
// 선택해서 깨울 수 있는 방법이 있으면 좋을텐데, 해서 나온게 condition이다.
// lock condition을 이용해 특정 스레드만 깨우고 대기하도록 할 수 있다.
public class Conditions {
    // notify()는 운이 안좋다면 필요한 쓰레드가 통지를 못 받고 계속 대기할 수 있는 단점이 존재하고 (기아 현상)
    // notifyAll()은 일단 대기하는 모든 쓰레드에게 통지를 하면 기아 현상은 막겠지만 불필요하게 필요한 쓰레드와 대기중인 쓰레드끼리 경쟁하게 된다.(경쟁 상태)

    //이를 해결하기위해 lock클래스와 condition클래스를 이용해야한다.
    // ReentrantLock()     // 재진입이 가능한 lock, 일반적인 lock
    // ReentrantReadWriteLock   // 읽기 lock 걸린 상태는 다른 스레드도 읽기 lock걸고 진입 가능, 그러나 쓰기는 안됨, 쓰기 lock걸린 상태에서는 읽기 안된.
    // StampedLock         // 읽기와 쓰기가 충돌하면 쓰기 lock을 걸고 쓰기가 끝난 후에 읽기 lock을 건다.
    Lock lock = new ReentrantLock();
    Condition forCook = lock.newCondition();
    public static void main(String[] args) {
        // WaitNotifyEx 소스에 예시로 샘플 만들어놓음.

    }
    public void add(String dish) {
        lock.lock();


    }
}
