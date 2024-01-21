package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.List;
// 최종 처리 reduce 예제, optional로 예외처리 가능?
public class ReduceEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("마시루", 92),
				new Student("기록", 95),
				new Student("코딩좌", 88)
		);
		int sum1 = studentList.stream()
				.mapToInt(s -> s.getScore())
						.sum();

		// reduce로 합을 구하기?
		int sum2 = studentList.stream()
				.mapToInt(s -> s.getScore())
//						.reduce(Integer::sum)// 두 값을 더한다?라는게 이해가 잘안됨
//						.reduce((a,b) -> a+b)// 두 값을 더한다?라는게 이해가 잘안됨, 결국 총합을 구한다는 소리 같은데
//						.reduce((a,b) -> a-b)// 이렇게하면 92 - 95 - 88 = -91 이런 결과가나옴. 루프한번 나온거에서 2번째 값부터 더한다 뺀다 이소리같음.
						.reduce((a,b) -> a*b)// 이렇게하면 92 * 95 * 88 = 769120 이런 결과가나옴. 루프한번 나온거에서 2번째 값부터 더한다 뺀다 곱한다 이소리같음.
//						.reduce((a,b) -> a*b);// 이렇게 끝내는건 에러나네, OptionalInt라서 그런가봄
								.getAsInt();

		int sum3 = studentList.stream()
				.mapToInt(Student::getScore)
						.reduce(0, (a,b) -> {return a+b;});

//		int sum1 = studentList.stream()
//				.mapToInt(Student :: getScore)
//				.sum();
//
//		int sum2 = studentList.stream()
//				.map(Student :: getScore)
//				.reduce((a, b) -> a+b)
//				.get();
//
//		int sum3 = studentList.stream()
//				.map(Student :: getScore)
//				.reduce(0, (a, b) -> a+b);

		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}
