package com.javastudy.exam.string;

// equasl Strign 문자열 비교

public class equalsIgnoreCase {
    public static void main(String[] args) {
        String str ="Sa";
        String input = str.trim(); // 공백제거


        if(str.equalsIgnoreCase("sa")) { // equalsIgnoreCase 대소문자 구분안하고 equals 확인
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if(str.equals("sa")) { // equals 확인, 대소문자 구분함.
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
