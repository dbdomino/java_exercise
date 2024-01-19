package com.javastudy.exam.lambdasic.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// 리턴값 없이 바로 끝나는 람다함수
		// Consumer들과 accept()함수로, 별도의 함수형 인터페이스 선언 없이 람다식 사용 가능하다.
		//
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("consumer java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("bigConsumer Java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("doubleConsumer Java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("objIntConsumer Java", 8);
	}
}
