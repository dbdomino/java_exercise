package com.javastudy.exam.stream.stream_return;

import java.util.stream.IntStream;
// Int 범위 내에서 Stream으로 읽기 가능하다.
public class StreamFromIntRange {
	public static int sum;
	
	public static void main(String[] args) {
//		IntStream stream = IntStream.range(1,  4);  // 1~3까지, 마지막은 읽지 않는다.
		IntStream stream = IntStream.rangeClosed(1,  150);  // 1~150까지, 마지막도 읽는다. 범위를 지정해서 합계 구하기 좋다.
		stream.forEach(a -> sum += a);
		System.out.println("합계: " + sum);
	}
}
