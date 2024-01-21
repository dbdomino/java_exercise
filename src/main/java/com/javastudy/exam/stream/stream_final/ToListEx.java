package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// 최종 처리 Correction 중에서 List로 반환하는 예제
public class ToListEx {
	public static void main(String[] args) {
		List<StudentEnum> totalList = Arrays.asList(
				new StudentEnum("마시루", 10, StudentEnum.Sex.MALE),
				new StudentEnum("기록", 6, StudentEnum.Sex.FEMALE),
				new StudentEnum("물림", 10, StudentEnum.Sex.MALE),
				new StudentEnum("코딩좌", 6, StudentEnum.Sex.FEMALE)
		);

		//남학생들만 묶어 List 생성
		List<StudentEnum> mailList = totalList.stream()
				.filter(s -> s.getSex().equals(StudentEnum.Sex.MALE))
//				.filter(s -> s.getSex() == StudentEnum.Sex.MALE) // 문자열 비교가 아니라 enum으로 Sex 열거형 비교라서 == 로도 비교가 됨.
						.collect(Collectors.toList());
		mailList.stream()
				.forEach( s -> System.out.println(s.getName()));

		System.out.println();

	}
}
