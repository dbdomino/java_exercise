package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.List;
// mapXXX 중간 처리 예시
public class MapEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("마시루", 10),
				new Student("물림", 20),
				new Student("기록", 30)
		);
//
//		studentList.stream()
//			.mapToInt(Student :: getScore)
//			.forEach(score -> System.out.println(score));
		studentList.stream()
//				.mapToInt( s -> {return s.getScore();})
//				.forEach(score -> {
//					System.out.println(score);
//				});
		        .mapToInt(Student::getScore)  // 메소드참조로 변환
				.forEach(System.out::println); // 메소드 참조로 변환
	}
}
