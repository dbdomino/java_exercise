package com.javastudy.exam.exception;

public class TryCatchSample01 {
    public static void main(String args[]) {
        tryrun t1 = new try01();
        t1.run();
    }	// main메서드의 끝
}

class try01 implements tryrun {
    public void run(){
        System.out.println(1);
        try {
            System.out.println(0/0);
            System.out.println(2); 	// 실행되지 않는다.
        } catch (ArithmeticException ae)	{
            System.out.println("ArithmeticException occure");
            // printStackTrace() 예외 발생 당시의 호출스택(Call Stack)에 있던 메서드 정보와
            // 예외 메시지를 같이 보여준다.
            System.out.println("ae.printStackTrace()");
            ae.printStackTrace();
            // getMessage() 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
            System.out.println("ae.getMessage()");
            System.out.println(ae.getMessage());


        } catch (Exception e) {  // Exception 클래스는 예외 최상위 클래스라 보통 젤하단에 놓는걸 추천한다.
            System.out.println(3);
        }	// try-catch의 끝
        System.out.println(4);
    }
}
class try02 implements tryrun {
    public void run(){
        System.out.println(1);
        try {
            System.out.println(0/0);
            System.out.println(2); 	// 실행되지 않는다.
        } catch (ArithmeticException ae)	{
            System.out.println(3);
        }	// try-catch의 끝
        System.out.println(4);
    }
}
