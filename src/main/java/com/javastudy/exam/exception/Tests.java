package com.javastudy.exam.exception;
// 커맨드라인에서 입력된 값들은 문자열 배열로 main메서드에 args[] 배열로 담겨 전달된다.
public class Tests {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        system.out.println("Hello World!"); // system 이라면 빨간줄 뜨면서 컴파일러가 에러라고 찾아준다. - 컴파일에러
        System.out.println(1);

        try {
            System.out.println(2);
            System.out.println(3);
            System.out.println(args[0]); // 그냥 실행시 런타임 에러 발생, args[0]으로 받은게 없어서 그렇다.
//            system.out.println("Hello World!"); // 컴파일 에러 때문에 있으면 실행 안됨.
        } catch (Exception e)    {
            System.out.println(4);  // 런타임 에러 발생시 catch로 출력
            System.out.println(e);  //
            System.out.println(e.toString());  //
        } //
        System.out.println(5);
    }
}
