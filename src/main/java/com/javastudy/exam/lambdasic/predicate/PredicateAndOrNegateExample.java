package com.javastudy.exam.lambdasic.predicate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수 검사
//		IntPredicate predicateA = a -> {return a%2 == 0; };
		IntPredicate predicateA = a -> a%2 == 0; // return 문 하나일 때 대활호 빼고 가능하다.

		//3의 배수 검사
//		IntPredicate predicateB = (a) -> a%3 == 0;
		IntPredicate predicateB = a -> a%3 == 0; // 매개변수 하나일 때 ( ) 괄호 빼기 가능

		IntPredicate predicateAB;
		boolean result;
//		System.out.println("predicateA = "+ predicateA.toString()); // 객체의 람다 주소값이 나옴
//		System.out.println("predicateB = "+ predicateB.toString()); // 매개변수가 들어가지 않았으므로 결과도 안나올 게 뻔함.

		//and()
		predicateAB = predicateA.and(predicateB); //
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);

		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);

		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
	}
}
