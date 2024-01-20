package com.javastudy.exam.stream;

import java.util.Arrays;
import java.util.Comparator;
// Stream 중간처리, 최종처리 예시
public class StreamEx {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                //중간처리, 여러 작업을 이어서 가능, 메서드 체이닝
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
                .filter((a) -> a % 2 == 0)  //  짝수만 뽑아낸다.
                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                //최종 처리(intstream으로 변경 및 배열로 반환)
                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
    }
}
