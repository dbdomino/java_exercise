package com.javastudy.exam.lambdasic.method_references;

import java.util.function.IntBinaryOperator;
// 메소드 참조 예시
public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		//정적 메소드 참조 ---------------------------------
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));

		operator = Calculator :: staticMethod;
		System.out.println("결과2: " +  operator.applyAsInt(3, 4));

		//인스턴스 메소드 참조 ---------------------------
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);// 람다식 구성 = 메소드 작성
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6)); // 람다식 실행, 매개변수 대입

		operator = obj :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}
}
