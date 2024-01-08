package com.javastudy.exam.exception;
// 예외 발생시키기
// 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다
// 2. Exception e = new Exception("고의로 발생시켰음");
// 3. 키워드 throw를 이용해서 예외를 발생시킨다.
// 4. throw e;
public class throwE {
    public static void main(String[] args) {
        try {
            System.out.println("전전");
            Exception e = new Exception("고의로 하하");
            throw e;

        } catch (Exception e) { // throw한 exception 형식과 같은것에서 잡아 처리됨
            System.out.println("에러미시지 : "+ e.getMessage());
            e.printStackTrace();
        }
        System.out.println("후후");
    }
}
