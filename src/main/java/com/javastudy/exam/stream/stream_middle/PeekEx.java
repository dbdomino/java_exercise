package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.stream.IntStream;

// 중간 처리 peek() 예제
public class PeekEx {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };

		IntStream streami = Arrays.stream(intArr);
//		Stream stream = Arrays.stream(intArr); // 에러, int 배열이 담겨서 IntStream으로 반환하기 때문
//		streami.filter( a -> a%2 == 0) // 짝수만 가져오겠다 == 필터링하겠다.
//				.peek( n -> System.out.println("n : "+n))
//				.sum(); // 끝

		int sum = streami.filter( a -> a%2 == 0) // 짝수만 가져오겠다 == 필터링하겠다.
				.peek( n -> System.out.println("n : "+n))
				.sum(); // 끝
		System.out.println("sum : "+sum);

//		System.out.println("[peek()를 마지막에 호출한 경우]");
//		Arrays.stream(intArr)
//				.filter(a -> a%2==0)
//				.peek(n -> System.out.println(n));   //동작하지 않음
//
//		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
//		int total = Arrays.stream(intArr)
//				.filter(a -> a%2==0)
//				.peek(n -> System.out.println(n))   //동작함
//				.sum();
//		System.out.println("총합: " + total);
//
	}
}
