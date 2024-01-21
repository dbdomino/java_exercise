package com.javastudy.exam.stream.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expressions",
			"Java8 supports lambda expressions"
		);
		list.stream()
			.filter(a -> a.toLowerCase().contains("java")) // 대소문자와 관련없이 하기위해 toLowerCase() 하고 contains("java")로 "java"가 포함된 문자열 검색
			.forEach(a -> System.out.println(a));
	}
}
