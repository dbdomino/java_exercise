package com.javastudy.exam.exception;

import java.util.InputMismatchException;

public class MultiCatch {
    public static void main(String[] args) {
        try{
//            ....
        } catch (ArithmeticException | InputMismatchException aae) {
            // 멀티 catch 블럭.... 이런식으로 catch 블럭을 하나로 합치기도 가능 jdk 1.7부터 지원
            System.out.println(aae);

        } catch (NullPointerException dd) {
            System.out.println(dd);
        }
    }
}
