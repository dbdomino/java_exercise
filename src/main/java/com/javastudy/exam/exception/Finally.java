package com.javastudy.exam.exception;

// try catch 진행 후 반드시 실행해야 하는 작업이 수행되는 곳
public class Finally {
    public static void main(String args[]) throws MemoryException {
        try {
            throw new SpaceException("스페이스 익셉션 발생");
        } catch (SpaceException e)	{
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } finally {
            ExceptionTest.deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } // try의 끝
    } // main의 끝
}
