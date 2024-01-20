package com.javastudy.exam.stream.stream_pipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelines {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("재학", Member.MALE, 30),
				new Member("유경", Member.FEMALE, 20),
				new Member("정인", Member.MALE, 45),
				new Member("효은", Member.FEMALE, 27)
		);
		// filter()로 파이프라인을 이어나감
//		list.stream().filter(m -> m.getSex() == Member.MALE)
//				.mapToInt(Member::getAge) // m->Member.getAge(m)
//				.average() // 평균
//				.getAsDouble(); // double 형으로 받기


//		double result = list.stream().filter(m -> m.getSex() == Member.MALE)
//				.mapToInt(Member::getAge) // m->Member.getAge(m)
//				.average() // 평균
//				.getAsDouble(); // double 형으로 받기
//
//		System.out.println("남자 평균 나이: " + result);


		double result = list.stream().filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member::getAge); // m->Member.getAge(m)

	}
}