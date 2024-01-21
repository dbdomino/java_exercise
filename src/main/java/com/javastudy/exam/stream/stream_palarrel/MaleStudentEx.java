package com.javastudy.exam.stream.stream_palarrel;

import java.util.Arrays;
import java.util.List;

public class MaleStudentEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("기록", 30, Student.Sex.MALE),
				new Student("물림", 40, Student.Sex.FEMALE),
				new Student("코딩좌", 50, Student.Sex.FEMALE),
				new Student("마시루", 60, Student.Sex.MALE)
		);

		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);

		maleStudent.getList().stream()
				.forEach(s -> System.out.println(s.getName()));
	}
}
