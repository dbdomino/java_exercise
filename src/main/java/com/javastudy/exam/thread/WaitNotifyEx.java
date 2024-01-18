package com.javastudy.exam.thread;

import java.util.ArrayList;
// 예제를 보면 wait와 notify로 스레드를 잠재우는건 좋은데, notify로 어떤 스레드를 깨울지 알 수 없다는게 문제다.
public class WaitNotifyEx {
    public static void main(String[] args) throws Exception {
        Table table = new Table(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "COOK").start();
        new Thread(new Customer(table, "donut"),  "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(8000);
        System.exit(0);
    }
}
class Customer implements Runnable {
    private Table  table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food  = food;
    }

    public void run() {
        while(true) {
            try { Thread.sleep(10);} catch(InterruptedException e) {}
            String name = Thread.currentThread().getName();

            if(eatFood())
                System.out.println(name + " ate a " + food);
            else
                System.out.println(name + " failed to eat. :(");
        } // while
    }

    boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {	this.table = table; }

    public void run() {
        while(true) {
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try { Thread.sleep(100);} catch(InterruptedException e) {}
        } // while
    }
}

class Table {
    String[] dishNames = { "donut","donut","burger" };
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();
    public synchronized void add(String dish) { // synchronized를 추가
//        if(dishes.size() >= MAX_FOOD)
//            return;
//        dishes.add(dish);
        while(dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println("dishes.size() "+dishes.size()+" >=" +  MAX_FOOD+" MAX_FOOD");
            System.out.println(name+"is waiting");
            try {
                wait();  // Cook 스레드를 기다리게 한다. 음식이 너무많으니
                Thread.sleep(500);

            } catch ( InterruptedException e) {}
        }
        dishes.add(dish);
        notify(); // 기다리고있는  Cust를 깨움, 소비하기 위해, 그러나 과연 cust만 깨우는걸까?

        System.out.println("Dishes:" + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized(this) {
            String name = Thread.currentThread().getName();
            while(dishes.size()==0) {
                System.out.println(name+" is waiting.");
//                try {
//                    Thread.sleep(500);
//                } catch(InterruptedException e) {}
                try {
                    wait();  // Cust를 기다리게 한다. 음식이 0개니까
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

//            for(int i=0; i<dishes.size();i++)
//                if(dishName.equals(dishes.get(i))) {
//                    dishes.remove(i);
//                    return true;
//                }
            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); // 잠자는 요리사를 깨운다. dish를 만들기 위해
                        return true;
                    }
                }
                try {
                    System.out.println(name + " is waiting.");
                    wait(); // 원하는 음식이 없는 Cust를 기다리게 한다.
                    Thread.sleep(500);
                } catch (InterruptedException e) {}  // thread는 InterruptedException

            } // while

        } // synchronized
//
//        return false;
    }

    public int dishNum() { return dishNames.length; }
}
/* synchronized 대신 lock객체와 condition객체로 thread를 타겟팅해서 await을 주고 signal로 깨우는게 가능하다.
class Table {
    Lock lock = new ReentrantLock();
    Condition forCook = lock.newCondition();
    Condition forCust = lock.newCondition();


    String[] dishNames = { "donut","donut","burger" };
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();
    public void add(String dish) { // synchronized를 추가
//        if(dishes.size() >= MAX_FOOD)
//            return;
//        dishes.add(dish);
        lock.lock();
        try {
            while (dishes.size() >= MAX_FOOD) {
                String name = Thread.currentThread().getName();
                System.out.println("dishes.size() " + dishes.size() + " >=" + MAX_FOOD + " MAX_FOOD");
                System.out.println(name + "is waiting");
                try {
//                wait();  // Cook 스레드를 기다리게 한다. 음식이 너무많으니
                    forCook.await();  // Cook 스레드를 기다리게 한다. 음식이 너무많으니
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                }
            }
            dishes.add(dish);
            forCust.signal(); // notify()와 같은 역할
//            notify(); // 기다리고있는  Cust를 깨움, 소비하기 위해, 그러나 과연 cust만 깨우는걸까?

            System.out.println("Dishes:" + dishes.toString());
        }finally {
            lock.unlock(); // lock.lock()으로 록을 걸어줬다면 반드시 unlock()해줘야 한다.
        }
    }

    public boolean remove(String dishName) {


            String name = Thread.currentThread().getName();
            lock.lock();
            try {
                while (dishes.size() == 0) {
                    System.out.println(name + " is waiting.");
//                try {
//                    Thread.sleep(500);
//                } catch(InterruptedException e) {}
                    try {
                        forCust.await(); // wait()와 같은 역할  Cust를 기다리게 한다.
//                        wait();  // Cust를 기다리게 한다. 음식이 0개니까
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }

//            for(int i=0; i<dishes.size();i++)
//                if(dishName.equals(dishes.get(i))) {
//                    dishes.remove(i);
//                    return true;
//                }
                while (true) {
                    for (int i = 0; i < dishes.size(); i++) {
                        if (dishName.equals(dishes.get(i))) {
                            dishes.remove(i);
//                            notify(); // 잠자는 요리사를 깨운다. dish를 만들기 위해
                            forCook.signal();  //  notify()와 같은역할 Cook 스레드를 기다리게 한다. 음식이 너무많으니
                            return true;
                        }
                    }
                    try {
                        System.out.println(name + " is waiting.");
//                        wait(); // 원하는 음식이 없는 Cust를 기다리게 한다.
                        forCust.await(); // wait()와 같은 역할  Cust를 기다리게 한다.
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }  // thread는 InterruptedException

                } // while
            } finally {
                lock.unlock();
            }

        // synchronized
//
//        return false;
    }

    public int dishNum() { return dishNames.length; }
}


 */