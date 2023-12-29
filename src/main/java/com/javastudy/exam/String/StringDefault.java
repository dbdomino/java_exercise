package com.javastudy.exam.String;

public class StringDefault
{
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc"); // str1 과 str2의 value는 같다.

        // println 출력형식 지정 불가, 단순출력시 사용
        // printf 출력형식 지정 가능 %.2f 소수점 둘째까지 출력, %f 실수, %b 불린형식, %d 10진수, %x %X 16진수, %c 문자 출력, %s 문자열 출력
        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
//        System.out.println("\"abc\"==\"abc\" ? " + "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc"); // string은 equals() 비교해야 제대로 값을 비교 가능
        System.out.printf(" str1==str2 ? %b%n",    str1==str2); // value는 같으나 다른 객체를 나타내므로 다르다고 출력
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }
}
