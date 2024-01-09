package com.javastudy.exam.string;

public class Binary {
    public static void main(String[] args) {
        String[] s = new String[2];
        int i = 25;
        s[0] = Integer.toBinaryString(i);// 2진수 String 으로 변환
        s[1] = Integer.toString(i,2); //원하는 진수로 변환, radix 밑
        System.out.println(s[0]);
        System.out.println(s[1]);
        s[1] = Integer.toString(i,10);
        System.out.println(s[1]);
        s[1] = Integer.toString(i,16);
        System.out.println(s[1]);
        s[1] = Integer.toString(i,4);
        System.out.println(s[1]);
    }
}
