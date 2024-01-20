package com.javastudy.exam.stream.stream_return;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 배열로부터 stream 얻기
public class StreamFromArray {
	public static void main(String[] args) {
		// String Array 스트림 변환
		String[] strArray = { "물림", "기록", "마시루", "코딩좌"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();

		// int Array 스트림 변환
		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}
}
