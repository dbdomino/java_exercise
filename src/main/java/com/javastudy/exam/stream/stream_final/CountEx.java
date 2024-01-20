package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
// 최종 처리 count 예제
public class CountEx {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .count();
        System.out.println("2의 배수 개수: " + count);
    }
}
