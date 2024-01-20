package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.stream.IntStream;
// asDoubleStream 예제
public class AsDoubleStreamEx {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);

        intStream.asDoubleStream() // asDoubleStream()으로 int형식 stream을 double형식의 stream으로 바꿨다.
                .forEach(d -> System.out.println(d));  // forEach 로 반복자를 통해 결과를 하나씩 출력

    }
}
