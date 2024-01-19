package com.javastudy.exam.lambdasic.andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerB); // consuberB의 결과를 consumerA의 매개변수로 담아 실행시킨다.
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
