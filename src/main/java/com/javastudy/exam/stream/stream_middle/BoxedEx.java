package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.stream.IntStream;

// boxed() int 요소, long 요소, double 요소를 Integer, Long, Double 요소로 박싱해서 (wrapper) Stream을 생성
public class BoxedEx {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5};

        IntStream intStream  = Arrays.stream(intArray);
        intStream.boxed() // Stream<Integer>
//                .forEach(System.out::println); //일케해도 값은 나온다만.. int가 아니라 Integer형이라서...
                .forEach(obj -> System.out.println(obj.intValue())); // 이게 더 나아보인다.
    }
}
