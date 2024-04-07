package com.javastudy.exam.number;

public class CallByValue {
    public static void main(String[] args) {
        test1(30);
    }

    public static void test1(int a) {
        int b = a;
        a++;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
