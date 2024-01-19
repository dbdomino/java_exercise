package com.javastudy.exam.lambdasic.constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;  // function1 에 람다식으로 생성자참조 설정
		Member member1 = function1.apply("angel");  // 람다식 설정한거 실행하여 member1에 넣기, 생성자 실행된 것에 대해 결과값 반환

		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel"); // 생성자 매개변수 다양한 걸 매개변수 개수랑 타입만으로 조절이되네, 람다식에선 Member:: new 만 써줘도 되는듯
		// 핵심은 매개변수 개수를 몇개 쓸지 조절하는 함수형 인터페이스 선택이랑, 함수형 인터페이스 실행이네.
	}
}
