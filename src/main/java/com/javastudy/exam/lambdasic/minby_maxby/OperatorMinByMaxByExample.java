package com.javastudy.exam.lambdasic.minby_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
//		UnaryOperator
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		binaryOperator = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.price, f2.price));  // fruit 객체를 받았을 때, fruit객체의 price를 가지고 비교해서 minby 로 최소인 것 나오도록 식 구현
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000)); // 그럼 f1, f2중 프라이스가 작은 f1이 반환됨., 작업 실행은 BinaryOperator의 apply() 메소드로 실행 apply() 매개변수로 람다식의 매개변수를 넣어줌
		System.out.println(fruit.name);

		binaryOperator = BinaryOperator.maxBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
}