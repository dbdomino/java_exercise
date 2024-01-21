package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// GroupingBy 예제로, Collectors 이용해서 stream 의 collect()구현하기
public class GroupingByCollectorsEx {
	public static void main(String[] args) {
		List<StudentEnum> totalList = Arrays.asList(
				new StudentEnum("마시루", 13, StudentEnum.Sex.MALE, StudentEnum.City.Seoul),
				new StudentEnum("유경", 14, StudentEnum.Sex.FEMALE, StudentEnum.City.Pusan),
				new StudentEnum("물림", 27, StudentEnum.Sex.MALE, StudentEnum.City.Seoul),
				new StudentEnum("효은", 28, StudentEnum.Sex.FEMALE, StudentEnum.City.Pusan)
		);

		//성별로 평균 점수를 저장하는 Map 얻기
		Stream<StudentEnum> totalStream = totalList.stream();
		Function<StudentEnum, StudentEnum.Sex> classifier = StudentEnum :: getSex;
		ToDoubleFunction<StudentEnum> mapper = StudentEnum :: getScore;
		Collector<StudentEnum, ?, Double> collector1 = Collectors.averagingDouble(mapper);
		Collector<StudentEnum, ?, Map<StudentEnum.Sex, Double>> collector2 = Collectors.groupingBy(classifier, collector1);
		Map<StudentEnum.Sex, Double> mapBySex = totalStream.collect(collector2);
		
		/*Map<StudentEnum.Sex, Double> mapBySex = totalList.stream()
				.collect(
					Collectors.groupingBy(
						StudentEnum :: getSex,
						Collectors.averagingDouble(Student :: getScore)
					)
				);*/

		System.out.println("남학생 평균 점수: " + mapBySex.get(StudentEnum.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(StudentEnum.Sex.FEMALE));

		//성별로 쉼표로 구분된 이름을 저장하는 Map 얻기
		Map<StudentEnum.Sex, String> mapByName = totalList.stream()
				.collect(
					Collectors.groupingBy(
							StudentEnum :: getSex,
						Collectors.mapping(
								StudentEnum :: getName,
							Collectors.joining(",")
						)
					)
				);
		System.out.println("남학생 전체 이름: " + mapByName.get(StudentEnum.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(StudentEnum.Sex.FEMALE));
	}
}
