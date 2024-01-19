package com.javastudy.exam.lambdasic.andthen_compose;

import java.util.function.Function;
// compose와 andthen으로 작업 순서를 고려해서 람다식 끼리 연결 후 각 람다식의 매개변수로 참조시킬 수 있다.
public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		functionAB = functionA.andThen(functionB); // andThen 으로 functionB의 결과를 functionA에 매개변수로 넣어 실행해 결과를 본다.
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);

		functionAB = functionB.compose(functionA);  // compose 으로 functionB의 결과를 functionA에 매개변수로 넣어 실행해 결과를 본다.
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
		// 둘다 같은 결과가 나온다.
	}
}
