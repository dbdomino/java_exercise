package com.javastudy.exam.exception;
// checked 예외  -> Exception 과 자손, try catch로 반드시 써야함
// 컴파일러가 예외 처리 여부를 체크함(예외 처리 반드시 해야는 예외들을 의미)
// unchecked 예외 -> RuntimeException 과 자손, try catch 를 선택적으로 사용
// 컴파일러가 예외 처리 여부를 체크안함(예외처리 선택사항)
public class checkedException {
    public static void main(String[] args) {
        try {
            // Exception과 그 자손은 반드시 예외 처리를 해줘야 한다.(checked 예외)
            throw new Exception("커스텀 Exception"); // Exception 고의발생

        } catch (Exception e) {
            System.out.println("e.getMessage() : "+ e.getMessage());

        }
        System.out.println("try 끝");
        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일 OK. 다만 실패시 에러난다.(unchecked 예외)
//        throw new RuntimeException();
//        System.out.println("runtime Exception 끝"); // 에러,throw new RuntimeException(); 이거때문에 뒤에 컴파일러에서 차단시킴
        // 에러 안나게 하려면 try catch 둘러서 해결해줘야한다.
        try {
            // Exception과 그 자손은 반드시 예외 처리를 해줘야 한다.(checked 예외)
            System.out.println("2번째 try");
            throw new RuntimeException("");

        } catch (Exception e) {
            System.out.println("e.getMessage() : "+ e.getMessage());

        }
    }
}
