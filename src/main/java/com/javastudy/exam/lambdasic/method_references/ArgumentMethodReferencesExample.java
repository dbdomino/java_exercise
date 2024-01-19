package com.javastudy.exam.lambdasic.method_references;

import java.util.function.ToIntBiFunction;
// 함수적 요소 메소드 참조
public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		ToIntBiFunction<String,String> function;

		function = (a, b) -> a.compareToIgnoreCase(b); // return 문이 하나면 대활호 생략 가능 {}
		print(function.applyAsInt("Java8", "JAVA8"));

		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	public static void print(int order) {
		if(order<0) { System.out.println("사전순으로 먼저 옵니다."); }
		else if(order == 0) { System.out.println("동일한 문자열입니다."); }
		else { System.out.println("사전순으로 나중에 옵니다."); }
	}
}
