package com.javastudy.exam.exception;

// 사용자 정의 예외 만들기
// 직접 예외 클래스를 정의할 수 있다.
//

public class CustomException extends Exception{
    private final int ERR_CODE; // 생성자를 통해 초기화 한다.

    // 기본적으로 생성자를 만들어주자.
    CustomException(String msg, int ErrCode) {
        super(msg); // 조상인 Exception의 생성자를 호출
        ERR_CODE = ErrCode;
    }
    CustomException(String msg) {
        this(msg, 150); // 조상인 Exception의 생성자를 호출
    }

    public int getErrCode(){
        return ERR_CODE;
    }

}
class InstallException extends Exception {
    InstallException(String msg){
        super(msg);
    }
}
class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}