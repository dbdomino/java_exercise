package com.javastudy.exam.condititon;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 이 Buffer 는 array index 재배치를 하지 않고, front 와 rear 값을 두고 control 해서 rear < front 일수도 있는 형태이다.
 */

public class ConditionEx {
    private final String[] buffer;
    private final int capacity;

    private int front;
    private int rear;
    private int count;

    private final Lock lock = new ReentrantLock();

    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public ConditionEx(int capacity) {
        super();
        this.capacity = capacity;
        buffer = new String[capacity];
    }


    public void deposit(String data) throws InterruptedException {
        lock.lock();
        try {
            while (count == capacity) {
                notFull.await(); // not full condition 이 될 때까지 대기한다.
            }

            buffer[rear] = data;
            rear = (rear + 1) % capacity;
            count++;

            System.out.println("deposit() rear: "+ rear);

            notEmpty.signal(); // not empty condition 이 충족되었음을 알린다.
        } finally {
            lock.unlock();
        }
    }

    public String fetch() throws InterruptedException {
        lock.lock();

        try {
            while (count == 0) {
                notEmpty.await(); // not empty condition 이 될때까지 기다린다.
            }

            String result = buffer[front];
            System.out.println("fetch() result: "+ result);
            System.out.println("fetch() rear: "+ rear);
            System.out.println("fetch() front: "+ front);
            front = (front + 1) % capacity;
            count--;
            System.out.println("fetch() front: "+ front);

            notFull.signal(); // not full condition 이 충족되었음을 알린다.

            return result;
        } finally {
            lock.unlock();
        }
    }
}
