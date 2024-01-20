package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// sorted() 예제, IntStream, List로 돌려보기
public class SortedEx {
	public static void main(String[] args) {
		//숫자 요소일 경우
		int[] intArr= {7, 2, 9, 3, 5};
		IntStream intStream = Arrays.stream(intArr);
//		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4}); // 됨
//		IntStream intStream = Arrays.stream({5, 3, 2, 1, 4}); // 에러

//		intStream.sorted() // 정렬기준 기본값, 오름차순!
		intStream // 정렬 없이
//				.forEach(n -> System.out.println(n));
				.forEach(System.out :: println);
		System.out.println();

		//객체 요소일 경우
		List<Student> studentList = Arrays.asList(
				new Student("물림", 30),
				new Student("마시루", 10),
				new Student("기록", 20)
		);
		List<StudentComparable> studentListC = Arrays.asList(
				new StudentComparable("물림", 30),
				new StudentComparable("마시루", 10),
				new StudentComparable("기록", 20)
		);
//		Stream<Student> stream = studentList.stream();
//		stream.sorted(s -> s.getScore())
//		stream 			// Student 일때 sorted 안쓰면 에러안남, 정렬도 없음.
//		stream.sorted() // Student sorted() 쓰면 에러. 객체다보니 정렬기준이 없기 때문이며, implements 로 Comparable을 추가해서
				// compareTo를 구현해줘야 한다.그래야 해당 객체가 무엇을 기준으로 정렬할지 정해지며, sorted()에서도 기준을 읽어 정렬 가능하다.
				// compareTo를 구현한 studentListC 리스트로 stream을 만들어서 테스트해보자.
		Stream<StudentComparable> stream = studentListC.stream();
		stream.sorted() // sorted()에 아무런 조건없이도 score기준으로 정렬이되었다. 왜인가? compareTo가 구현되어 정렬조건을 읽어 정렬하기 때문
//		stream.sorted(Comparator.reverseOrder() ) // 추가적으로 정렬조건을 줄 수도 있다. 안에 들은 조건이 compareTo를 구현했기 때문
				.forEach(s -> System.out.println(s.getScore()));

	}
}
