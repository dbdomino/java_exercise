package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
// XXXmatch() 최종처리 예제
public class MatchEx {
	public static void main(String[] args) {
		int[] intArr = { 2, 4 ,6 };

		// 2의 배수인지 확인하는 예제

		boolean resultb = Arrays.stream(intArr)
				.allMatch(n -> n % 2 == 0); // 전부 2의 배수인가?
		System.out.println("전부 2의 배수인가? : "+resultb);

		boolean resultc = Arrays.stream(intArr)
				.anyMatch(n -> n % 6 == 0); // 하나라도 6의 배수가 있나?
		System.out.println("하나라도 6의 배수인가?? : "+resultc);

		boolean resultd = Arrays.stream(intArr)
				.noneMatch(n -> n % 7 == 0); // 7의 배수는 없는가?
		System.out.println("7의 배수는 없는가? : "+resultd); // true 7의 배수는 없다.
		resultd = Arrays.stream(intArr)
				.noneMatch(n -> n % 4 == 0); // 4의 배수는 없는가?
		System.out.println("4의 배수는 없는가? : "+resultd); // false 4의 배수는 있다.

	}
}
