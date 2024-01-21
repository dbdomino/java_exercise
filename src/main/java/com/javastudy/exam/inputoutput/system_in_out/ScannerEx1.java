package com.javastudy.exam.inputoutput.system_in_out;

import java.util.Scanner;

/*
java.util.Scanner
- 콘솔로부터 기본 타입의 값을 바로 읽을 수 있다.
- Scanner sc = new Scanner(System.in)
- nextBoolean() / boolean 값으로 읽는다.
- nextByte() / byte 값으로 읽는다.
- nextInt() / Int 값으로 읽는다.
- nextLong() / long 값으로 읽는다.
- nextFloat() / float 값으로 읽는다.
- nextDouble() / double 값으로 읽는다.
- nextLine() / String 값으로 읽는다.
 */
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 >");
        String inputString = sc.nextLine();
        System.out.println(inputString);
        System.out.println();

        System.out.print("정수 입력 >");
        int inputInt = sc.nextInt();
        System.out.println(inputInt);
        System.out.println();

        System.out.print("실수 입력 >");
        double inputDouble = sc.nextDouble();
        System.out.println(inputDouble);
        System.out.println();

    }
}
