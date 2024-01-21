package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 최종 처리 Correction 중에서 HashSet으로 반환하는 예제
public class ToHashSetEx {
	public static void main(String[] args) {
		List<StudentEnum> totalList = Arrays.asList(
				new StudentEnum("마시루", 10, StudentEnum.Sex.MALE),
				new StudentEnum("기록", 6, StudentEnum.Sex.FEMALE),
				new StudentEnum("물림", 10, StudentEnum.Sex.MALE),
				new StudentEnum("코딩좌", 6, StudentEnum.Sex.FEMALE)
		);

		//여학생들만 묶어 HashSet 생성
		Set<StudentEnum> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == StudentEnum.Sex.FEMALE)
				//.collect(Collectors.toCollection(HashSet :: new));
				//.collect( Collectors.toCollection(()->{return new HashSet<Student>();}) );
				.collect( Collectors.toCollection(()->new HashSet<StudentEnum>()) );
		femaleSet.stream()
				.forEach(s -> System.out.println(s.getName())); // Set이다보니 순서가 보장이 안된다.
	}
}
