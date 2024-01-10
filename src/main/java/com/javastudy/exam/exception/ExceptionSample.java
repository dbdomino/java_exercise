package com.javastudy.exam.exception;

import static com.javastudy.exam.exception.ExceptionTest.copyFiles;
import static com.javastudy.exam.exception.ExceptionTest.startInstall;
// 연결된 예외도 적용하기 chained exception(하나의 에러에 여러에러를 묶어서 보여주기 위해 사용하는 기능)
// 에러객체 생성해서 신규에러객체e.initCause(원래에러객체e); 로 선언 후 throw 신규에러객체e; 로 에러 상위 메소드로 넘기기 가능,
// 그러면 stacktrace에서 caused by 에러 식으로 쌓여서 에러들이 연결되어 출력됨.

class ExceptionTest {
    static void startInstall() throws SpaceException, MemoryException, InstallException {
        try{
            if(!enoughSpace()) 		// 충분한 설치 공간이 없으면...
                throw new SpaceException("설치할 공간이 부족합니다.");
            if (!enoughMemory())		// 충분한 메모리가 없으면...
                throw new MemoryException("메모리가 부족합니다.");
        } catch (SpaceException se) {
            // SpaceException
            // 여기서 checked예외인 Exception을 unchecked예외인 RuntimeException으로 변경해서 내보내는 것도 가능하다.
            InstallException ie = new InstallException(("SpaceException 설치중 예외발생, InstallException ie 내보내기준비"));
            ie.initCause(se); // InstallException의 원인 예외를 SpaceException으로 지정
            throw ie; // ie를 밖으로 내보낸다.
        }

    } // startInstall메서드의 끝
    static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/ }
    static boolean enoughSpace()   {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }
    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
        return true;
    }
}

public class ExceptionSample {
    public static void main(String args[]) {
        try {
            startInstall();		// 프로그램 설치에 필요한 준비를 한다.
            copyFiles();		// 파일들을 복사한다.
        } catch (SpaceException e)	{
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (MemoryException me)	{
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();         // Garbage Collection을 수행하여 메모리를 늘려준다.
            System.out.println("다시 설치를 시도하세요.");
        } catch (InstallException e) {
            throw new RuntimeException(e);
        } finally {
            ExceptionTest.deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } // try의 끝
    } // main의 끝
}
