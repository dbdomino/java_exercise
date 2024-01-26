package com.javastudy.exam.collections.stackqueue;

import java.util.PriorityQueue;
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 나올때 낮은값이 우선순위가 높다. 오름차순
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 나올때 높은 값이 우선순위가 되려면,

        pq.add(5);
        pq.add(3);
        pq.add(10);
        pq.add(7);

        System.out.println(pq);
        pq.add(1); // 값의 중복은 허용된다.
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq.poll());// 작은 값이 우선순위다.
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
