package com.javastudy.exam.exception;

// 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
public class GetMessage {
    public static void main(String[] args) {
        try {
            System.out.println(0/0);
        }catch (Exception e)	{
            System.out.println("에러 메시지 : " + e.getMessage());
            // 예외 클래스에 저장된 에러 메시지를 볼 수 있다.
        }
    }
}
