package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Stream Filter 필터 예제
public class FilterEx {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("가가", "나나", "다다", "나나", "라라");


		names.stream()
				.filter(n -> n.startsWith("가"))
				.forEach(n -> System.out.println(n)); // 가로 시작된것만 가져오기
		System.out.println("-----");

		names.stream()
				.filter(n -> {
					if (n.contains("나") ) return true; // true 반환 이라면 결과에 포함시킴.
					else return false; // false반환 이라면 결과에 포함 시키지 않음.
				})
				.forEach(n -> System.out.println(n)); //

		System.out.println("-----");

		names.stream()
				.distinct()
				.filter(n -> n.startsWith("다"))
				.filter(n -> n.startsWith("나"))
				.forEach(n -> System.out.println(n)); // 다, 나로 시작된것만 가져오기, 없음

		System.out.println("-----");

		List<String> result = names.stream()
				.filter(n -> {
					if (n.contains("나")) return true; // true 반환 이라면 결과에 포함시킴.
					else return false; // false반환 이라면 결과에 포함 시키지 않음.
				})
				.toList();//
//				.collect(Collectors.toList());
		System.out.println("List  : "+result);

	}
}
