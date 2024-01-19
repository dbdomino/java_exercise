package com.javastudy.exam.lambdasic.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList( // 리스트 생성
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("감자바", "남자",  95),
			new Student("박한나", "여자", 92)
	);
		
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {  // predicate = t ->  t.getSex().equals("남자")
										// test(student)는 학생 객체를 받아 람다식을 수행, 즉 student.getSex().equals("남자") 냐 를 보고 참이면 합계더해서 평균 구하는 것임,.
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
		
	public static void main(String[] args) {
		double maleAvg = avg( t ->  t.getSex().equals("남자") ); // 메소드 avg 선언, 매개변수로 Predicate<Student> predicate 를 받아오는데, Predicate는 함수형 인터페이스
//		그러므로 avg(람다식 구현)을 써서 Predicate 특성상 true false로 반환
		// 성별 이 "남자"인 student 일 경우 true인데,
		System.out.println("남자 평균 점수: " + maleAvg);

		double femaleAvg = avg( t ->  t.getSex().equals("여자") );
		System.out.println("여자 평균 점수: " + femaleAvg);
	}
}
