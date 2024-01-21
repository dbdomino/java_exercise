package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// collect() 그룹핑 예제, Map으로 그룹핑 조건 설정하여 만들기
public class GroupingEx {
    public static void main(String[] args) {
        List<StudentEnum> totalList = Arrays.asList(
                new StudentEnum("마시루", 10, StudentEnum.Sex.MALE, StudentEnum.City.Seoul),
                new StudentEnum("유경", 6, StudentEnum.Sex.FEMALE, StudentEnum.City.Pusan),
                new StudentEnum("물림", 10, StudentEnum.Sex.MALE, StudentEnum.City.Seoul),
                new StudentEnum("효은", 6, StudentEnum.Sex.FEMALE, StudentEnum.City.Pusan)
        );

        Map<StudentEnum.Sex, List<StudentEnum>> mapBySex = totalList.stream()
//                .collect(Collectors.groupingBy(s -> s.getSex()) ) ;
                .collect(Collectors.groupingBy(StudentEnum::getSex) ) ;
        System.out.println(mapBySex);
        System.out.println(" 성별로 map 구하기");
        mapBySex.get(StudentEnum.Sex.MALE).stream()
                .forEach(s -> System.out.println(s.getName()));
//                .forEach(s -> System.out.println(s));  // toString 이 없어서 객체그대로 나옴.

        System.out.println(" 도시 단위로 사람 나누기 = 도시 단위로 사람 그룹핑 하기");
        Map<StudentEnum.City, List<String>> mapByCity = totalList.stream()
                .collect(
                  Collectors.groupingBy(  // groupinBy Function<? super T, ? extends K> classifier,  Collector<? super T, A, D> downstream
                          s -> s.getCity(),  // classifier
//                          s -> s.getName())
                          Collectors.mapping(s->s.getName(), Collectors.toList()))  // downstream
                );
        mapByCity.get(StudentEnum.City.Pusan).stream() // 맵의 list를 stream으로 받은 것
                .forEach(s -> System.out.println(s));

    }
}
