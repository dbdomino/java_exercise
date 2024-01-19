package com.javastudy.exam.lambdasic.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		// IntSupplier 매개변수 없이, 값을 int로 출력하는 함수형 인터페이스, 람다식으로 구현가능
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("숫자 : " + num);
	}
}
