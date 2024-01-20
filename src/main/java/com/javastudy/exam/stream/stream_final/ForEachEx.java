package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.stream.IntStream;

// 최종처리 forEach() 예제
public class ForEachEx {
    public static void main(String[] args) {
        int[] intArr = { 1, 2, 3, 4, 5 };
        IntStream streami = Arrays.stream(intArr);
        streami.filter(n -> n %2 == 1) // 홀수인 것만 가져오겠다 == 필터링하겠다.
//                . forEach(n -> System.out.println(n)); // forEach 는 최종참조 객체다.
                . forEach(System.out::println); // 메소드참조

    }
}
