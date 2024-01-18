package com.javastudy.exam.thread;

// 스레드의 동기화
/*
멀티 스레드 프로세스에서 다른 스레드의 작업에 영향을 미칠 수 있다.
진행중인 작업이 다른 스레드에게 간섭밪지 않게 하려면 '동기화'가 필요하다.
    즉, 스레드의 동기화 : 한 스레드가 진행중인 작업을 다른 스레드가 간섭하지 못하게 하는 것
동기화 하려면 간섭받지 않아야 하는 문장들을 '임계 영역'으로 설정해야 한다.(한 스레드가 영역에 작성하는동안 다른스레드가 이 영역에 들어오지 못하게 하도록 임계 영역으로 설정, 잠근다는 소리다.)
'임계 영역'은 락(lock)을 얻은 단 하나의 스레드만 출입가능(객체 1개에 락 1개, 객체 하나가 락을 가지고 있으면 다른객체는 락을 풀지못함.)
 */
// 구체적으로 synchronized를 이용해서 동기화 한다.

public class ThreadSynchronization {
    public static void main(String args[]) {
        Runnable r = new RunnableAccount2();
        new Thread(r).start();
        new Thread(r).start();
    }
}
class Account2 {
    private int balance = 2000; // private으로 해야 동기화가 의미가 있다.

    public  int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money){ // 출금 메소드, synchronized로 메서드를 동기화
        if(balance >= money) {  // 동기화 안되면 마지막 결과로 -가 될 수있다. 동시실행 되므로
            try { Thread.sleep(2000);} catch(InterruptedException e) {}
            balance -= money;
        }
    } // withdraw
    public void withdraw2(int money){ // 출금 메소드, synchronized로 메서드를 동기화

        System.out.print("withdraw2 ");
        System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름을 찍음
        synchronized (this) {
            if (balance >= money) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                balance -= money;
            }
        }
    } // withdraw
}

class RunnableAccount2 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
            System.out.println(Thread.currentThread().getName()); // 현재 스레드 이름을 찍음
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw2(money);
            System.out.println("balance:"+acc.getBalance());
        }
    } // run()
}
