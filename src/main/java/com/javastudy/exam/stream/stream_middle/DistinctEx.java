package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.List;
// Stream distinct 중복제거 예제
public class DistinctEx {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("가가", "나나", "다다", "나나", "라라");

		names.stream()
				.distinct()
				.forEach(n -> System.out.println(n)); // 가가 나나 다다 라라
		System.out.println();


		names.stream()
				.distinct()
				.filter(n -> n.startsWith("다")) // 다로 시작된것만 가져오기
				.forEach(n -> System.out.println(n)); // 다다
	}
}
