package com.javastudy.exam.exception;

import java.io.FileNotFoundException;

// 메서드에 예외 선언하기,
/*
    1. try-catch문
    2. 예외 선언하기 (메서드 선언부에 throws 붙여서 이전 실행 메소드로 에러 넘기기)
    3. 예외 되던지기 (exception re-throwing)
 */
class SampleThrows {
    SampleThrows() {}

    // method()에서 Exception과 그 자손 예외 발생 가능, Exception은 최상위 예외클래스로 모든 예외 발생(떠넘기기)가능
    void method() throws Exception {
        /* 오버라이딩 규칙
        1. 메서드명 일치
        2. 접근제어자 같거나 넓게
        3. 조상보다 많은예외 선언 안됨.
         */

    }
    // thorws를 붙이면 중간에 에러날 경우 에러객체를 만들어 이전 메소드로 넘긴다. 이전 메소드에서 에러 발생
    void method2() throws ArithmeticException, NullPointerException {
        throw new NullPointerException("method2 예외발생");
    }
    void method3() throws ArithmeticException, NullPointerException, FileNotFoundException {
        try {
//            throw new FileNotFoundException("ddㄷㄷd");
            throw new ArithmeticException("method3 Arithmetic 예외발생");
        } catch (ArithmeticException e) {
            // ArithmeticException 일경우 상위로 넘기지 않고 여기서 처리하기
            System.out.println("e.getMessage() : "+ e.getMessage());
            System.out.println("try catch로 method3에서 처리완료");
        }
    }
    void method4() throws ArithmeticException, NullPointerException, FileNotFoundException {
        try {
            throw new NullPointerException("method4 예외처리");
        } catch (ArithmeticException e) {
            // ArithmeticException 일경우 상위로 넘기지 않고 여기서 처리하기
            System.out.println("e.getMessage() : "+ e.getMessage());
            System.out.println("try catch로 method4 처리완료");
            throw new ArithmeticException("method4 에서 다시 던짐");
        }catch (NullPointerException e) {
            // ArithmeticException 일경우 상위로 넘기지 않고 여기서 처리하기
            System.out.println("e.getMessage() : "+ e.getMessage());
            System.out.println("try catch로 method4 처리완료");
            throw new NullPointerException("method4 에서 다시 던짐");
        }
    }
}
public class MethodException {
    public static void main(String[] args) throws FileNotFoundException {
        SampleThrows s = new SampleThrows();
        System.out.println("main 진행중");
        try {
            s.method3(); //
        } catch (Exception e) {
            System.out.println("e.getMessage() : "+ e.getMessage());
            System.out.println("try catch로 main에서 method3 처리완료");
        }
    // 예외 되던지기, 메소드에서 예외 처리한 뒤, main으로 다시 예외를 던져 main에서도 예외 처리 수행
        // 각자 위치에서 프로세스 실행이 필요한 경우 이런식으로도 운용
        try {
            s.method4(); //
        } catch (Exception e) {
            System.out.println("main e.getMessage() : "+ e.getMessage());
            System.out.println("try catch로 main에서 method4 처리완료");
        }

        s.method2(); // method2에서 throw new 로 에러를 만들었지만, 메소드에 throws를 넣어 상위실행 메소드인
        // main에서 에러가 확인되는 것을 볼 수 있으며, printstacktrace로 method2도 확인가능
    }

}
