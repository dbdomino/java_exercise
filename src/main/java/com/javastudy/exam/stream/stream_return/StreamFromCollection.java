package com.javastudy.exam.stream.stream_return;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// Collection List 로부터 Stream 얻기
public class StreamFromCollection {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList( // Student 형식 List
				new Student("기록", 10),
				new Student("마시루", 20),
				new Student("물림", 30),
				new Student("코딩좌", 40)
		);

		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(s.getName()));
	}
}
