package com.javastudy.exam.exception;

// 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
// 에러발생시 에러객체 e를 생성하고, 에러객체의 printStackTrace() 명령을 수행하여
// 에러를 추적할 수 있다.
public class PrintStackTrace {
    public static void main(String[] args) {
        try {
            System.out.println(3);
            System.out.println(4);
            System.out.println(0/0);
        } catch (ArithmeticException e) {
            e.printStackTrace(); // 예외 발생시 객체에 담긴 호출스택의 정보를 같이 출력해준다.
            // 복잡한 로직에서 에러 경로를 추적하기 위해 사용한다.
        } catch (Exception e)	{
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
