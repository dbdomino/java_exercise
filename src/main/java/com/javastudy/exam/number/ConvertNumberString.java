package com.javastudy.exam.number;

// 문자열 숫자 문자 변환
public class ConvertNumberString {
    public static void main(String[] args) {
//        int i = new Integer("100").intValue();
        int i2 = Integer.parseInt("100");
        int i3 = Integer.valueOf("100");
        // valueOf는 byte, short int, long, float, double 다된다.
        // n진법 문자열을 숫자로 변환
        int i4 = Integer.parseInt("100", 2);
        int i5 = Integer.parseInt("100", 2);
        int i6 = Integer.parseInt("100", 2);
        int i7 = Integer.parseInt("FF", 16);
        int i8 = Integer.parseInt("FF", 20);
//        int i8 = Integer.parseInt("FF"); // runtime 에러, Exception in thread "main" java.lang.NumberFormatException: For input string: "FF" under radix 2
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println(i8);



    }
}
