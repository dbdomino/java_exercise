package com.javastudy.exam.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample5 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("물림", "개발자"),
				new Member("기록", "디자이너"),
				new Member("마시루", "디자이너"),
				new Member("효은", "디자이너"),
				new Member("코딩좌", "개발자")
		);
// Member요소의 직업별로 그룹핑해서 Map<String, List<String>> 객체로 생성해보라
//		Map<String, List<String>> map =
		Map<String, List<String>> map = list.stream().collect(
				// Collectors.groupingBy( 그룹핑은 .collect(Collectors.groupingBy( .... ) )
//				Collectors.groupingBy(Member :: getJob)  // 이대로 끝내면 Map<String, List<Member>> 로 나와서, List<String>으로 바꾸기 위해 mapping 필요
				Collectors.groupingBy(Member :: getJob,
//						              Collectors.mapping(s -> s.getJob(), Collectors.toList())
						              Collectors.mapping(s -> s.getName(), Collectors.toList())
				)

		);

		System.out.print("[개발자] ");
		map.get("개발자").stream().forEach(s -> System.out.print(s + " "));
		System.out.print("\n[디자이너] ");
		map.get("디자이너").stream().forEach(s -> System.out.print(s + " "));


//		Map<String, List<String>> groupingMap = list.stream()
//				.collect(
//						Collectors.groupingBy(
//								Member::getJob,
//								Collectors.mapping(Member::getName, Collectors.toList())
//						)
//				);
//
//		System.out.print("[개발자] ");
//		groupingMap.get("개발자").stream().forEach(s -> System.out.print(s + " "));
//		System.out.print("\n[디자이너] ");
//		groupingMap.get("디자이너").stream().forEach(s -> System.out.print(s + " "));
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
