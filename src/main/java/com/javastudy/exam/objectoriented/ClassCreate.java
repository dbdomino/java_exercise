package com.javastudy.exam.objectoriented;

public class ClassCreate { }
// 클래스 선언시 규칙
/* 올바른 예시
Hello2.java
public class Hello2 {}   // public class가 있는 경우 소스파일의 이름은 반드시
       class Hello3 {}   // public class의 이름과 일치해야 한다.
*/
/*
Hello2.java
       class Hello2 {}   // public class가 하나도 없는 경우 소스파일의 이름은
       class Hello3 {}   // Hello2.java 나 Hello3.java 처럼 상관없다.
*/
//---------------------------------------------------------------
/* 틀린 예시
Hello2.java
public class Hello2 {}   // 하나의 소스파일에 public class가 둘이상 존재하면 안된다.
public class Hello3 {}   // 별도 소스파일에 나누던지 public을 하나빼던지 해야함
*/
/* 틀린 예시
Hello3.java
public class Hello2 {}   // 소스파일의 이름이 public class의 이름과 일치하지 않음.
       class Hello3 {}   //
*/
/* 틀린 예시
hello2.java
public class Hello2 {}   // 소스파일의 이름이 public class의 이름과 일치하지 않음.
       class Hello3 {}   // 대소문자도 구분하므로 확실히 봐야함
*/