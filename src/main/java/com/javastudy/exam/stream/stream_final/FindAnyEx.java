package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyEx {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("a", "a1", "b", "b1", "c", "c1");
// filter 조건에 일치하는 element 1개를 Optional로 리턴합니다. 조건에 일치하는 요소가 없다면 empty가 리턴됩니다.
        Optional<String> firstElement = elements.stream()
                .filter(s -> s.startsWith("b")).findFirst();

        System.out.println("findFirst: " + firstElement.get());

// findAny()도 findFirst()처럼 조건에 일치하는 요소 1개를 리턴합니다.
        Optional<String> anyElement = elements.stream()
                .filter(s -> s.startsWith("b")).findAny();

        System.out.println("findAny: " + anyElement.get());
/*
Stream을 직렬로 처리할 때 findFirst()와 findAny()는 동일한 요소를 리턴하며, 차이점이 없습니다.
하지만 Stream을 병렬로 처리할 때는 차이가 있습니다.
findFirst()는 여러 요소가 조건에 부합해도 Stream의 순서를 고려하여 가장 앞에 있는 요소를 리턴합니다.
면에 findAny()는 Multi thread에서 Stream을 처리할 때 가장 먼저 찾은 요소를 리턴합니다.
 */
        Optional<String> anyElement2 = elements.stream().parallel()
                .filter(s -> s.startsWith("b")).findAny(); // b가 나올수도있고, b1이 나올수도있습니다.

        System.out.println("findAny: " + anyElement2.get());

    }
}
