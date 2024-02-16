package com.javastudy.exam.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueEx {
    public static void main(String[] args) {
        //push pop
            Stack st = new Stack();
            Queue q = new LinkedList();	// Queue인터페이스의 구현체인 LinkedList를 사용
        // add poll
        //offer poll

            st.push("0");
            st.push("1");
            st.push("2");

            q.offer("0");
            q.offer("1");
            q.offer("2");

            System.out.println("= Stack =");
            while(!st.empty()) {
                System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
            }

            System.out.println("= Queue =");
            while(!q.isEmpty()) {
                System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
            }

    }
}
