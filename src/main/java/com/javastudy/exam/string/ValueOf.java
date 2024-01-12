package com.javastudy.exam.string;

public class ValueOf {
    public static void main(String[] args) {
        // 숫자를 문자열로 바꾸기
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);  // 이게 str1보다 더 빠르다.
        // 문자열을 기본형으로 바꾸기
        /*
        String b = String.valueOf(true);   ->   boolean Boolean.parseBoolean(String s)
        String c = String.valueOf('a');    ->   byte Byte.parseByte(String b)
        String s = String.valueOf(100);    ->   short Short.parseShort(String s)
        String i = String.valueOf(100);    ->   int Integer.parseInt(String i)
        String l = String.valueOf(100L);   ->   long Long.parseLong(String l)
        String f = String.valueOf(10f);    ->   float Float.parseFloat(String f)
        String d = String.valueOf(10.0);   ->   double Double.parseDouble(String d)
        */
        String ds = "10.0";
        double d = Double.parseDouble(ds);
        System.out.println(d);
    }
}
