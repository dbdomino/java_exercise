package com.javastudy.exam.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("물림", "개발자"),
				new Member("기록", "디자이너"),
				new Member("코딩좌", "개발자")
		);
// 개발자가 job인 name만 뽑아내자.
		List<Member> developers = list.stream()
				// 조건이 들어가므로 filter가 필요해보임
				.filter(m -> m.getJob().equals("개발자"))
				.collect(Collectors.toList());  // .collect() 최종 처리자에 Collectors.toList() 만 넣으면 list로 나온다라...)
//				.filter(m -> m.getJob().equals("개발자"))
//				.collect(Collectors.toList());
		System.out.println(developers); // 리스트라서 출력시 객체들이 출력되무. 그래서 스트림으로 뽑아서 m.getName()으로 돌리는게 편하다.
		developers.stream().forEach(m -> System.out.println(m.getName()));
	}

	static class Member {
		private String name;
		private String job;


		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}

		public String getName() { return name; }
		public String getJob() { return job; }
	}
}
