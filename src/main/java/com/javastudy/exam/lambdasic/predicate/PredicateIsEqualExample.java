package com.javastudy.exam.lambdasic.predicate;

import java.util.function.Predicate;
// predicate 에 isEqual로 값 지정해서 비교하기도 가능하다.
// String의 equals로 하는거랑 비슷ㅎ
public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null: " + predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: " + predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8: " + predicate.test("Java7"));
	}
}
