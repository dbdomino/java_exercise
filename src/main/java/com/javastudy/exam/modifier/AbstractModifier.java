package com.javastudy.exam.modifier;
/*
abstract 클래스 -> 클래스 내에 추상메서드가 선언되어 있는 클래스
추상메서드 : 구현부가 없는 메서드
 */

abstract class Abslot {  // 추상메소드가 포함된 클래스, 추상클래스
    abstract void strong(); // 추상메서드, 선언부만 존재하며, 구현부 {} 가 없는 메소드
}
//class Abslot2 {  // 추상메소드가 포함된 클래스, 추상메소드 있을때 abstract 안붙이면 컴파일 에러 발생
//
//    abstract void strong(); // 추상메서드, 선언부만 존재하며, 구현부 {} 가 없는 메소드
//}
public class AbstractModifier {
}
