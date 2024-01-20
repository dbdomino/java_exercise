package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;

// 최종 처리 sum 예제
public class SumEx {
    public static void main(String[] args) {
        long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .sum();
        System.out.println("2의 배수의 합: " + sum);
    }
}
