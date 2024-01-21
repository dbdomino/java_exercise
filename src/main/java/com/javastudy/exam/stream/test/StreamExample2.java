package com.javastudy.exam.stream.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("물림", 30),
				new Member("기록", 40),
				new Member("코딩좌", 29)
		);
		double avg = list.stream()
				.mapToInt(s -> s.getAge()) // Intstream으로 변경하기, map 메소드는 Stream을 Int Long Double R 같은걸로 바꿔주는 역할을 한다.
				// 값 특정항목만 가져와서 쓸때 사용
		        .average()
				.getAsDouble();

//
//		double avg = list.stream()
//				.mapToInt(Member::getAge)
//				.average()
//				.getAsDouble();

		System.out.println("평균 나이: " + avg);
	}

	static class Member {
		private String name;
		private int age;

		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() { return name; }
		public int getAge() { return age; }
	}
}
