package com.javastudy.exam.collections.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class QueueEx3 { // 자바에서 큐 직접 구현하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
//        Queue queue = new LinkedList(); // 마지막 값 가져오는데 기능이 한계가있음
        Deque queue = new LinkedList(); // 마지막 값 가져오기 위해 사용, 스택과 큐의 기능을 동시에가진 큐, 조심해서 써야한다.

        StringBuffer sb = new StringBuffer();
        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            switch (str) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
//                   System.out.println(queue.poll());
                    sb.append(queue.isEmpty()?-1:queue.poll()).append("\n");
                    break;
                case "size":
//                   System.out.println(queue.size());
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
//                   System.out.println(queue.isEmpty()?-1:0);
                    sb.append(queue.isEmpty()?1:0).append("\n");
                    break;
                case "front":
//                   System.out.println(queue.isEmpty()?-1:queue.peek()); // 빼지않고 맨앞 출력
                    sb.append(queue.isEmpty()?-1:queue.peek()).append("\n"); // 빼지않고 맨앞 출력
                    break;
                case "back":
//                   System.out.println(queue.isEmpty()?-1:queue.peekLast()); // dequeue 예시
                    sb.append(queue.isEmpty()?-1:queue.peekLast()).append("\n"); // dequeue 예시
            }
        }
        System.out.println(sb);

        br.close();
    }
}
