package com.javastudy.exam.lambdasic.operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(   // maxOrMin(IntBinaryOperator operator) 메소드를 실행하는데, 매개변수로 operator를 람다식으로 구성해서 적는다.
				// 이는 IntBinaryOperator operator에서 IntBinaryOperator 가 함수형 인터페이스 이기 때문이며, 매개변수 2개 받아서 int로 리턴하기에, int max = MaxOrMin()이 되는 것이다.
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}
}
