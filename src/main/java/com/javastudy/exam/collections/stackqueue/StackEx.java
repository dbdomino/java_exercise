package com.javastudy.exam.collections.stackqueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack st = new Stack(); // 스택은 배열로 구현한다. Vector
        String expression = "((3+5*8-2))";
//        String expression = "((3+5*8-2))))";

        System.out.println("expression:" + expression);
        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + ""); //string으로 push
                } else if (ch == ')') {
//                    st.pop(); //빼기
                    System.out.println(st.pop());               // 빼기
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try

    }
}
