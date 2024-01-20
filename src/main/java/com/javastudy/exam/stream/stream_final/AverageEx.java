package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.OptionalDouble;

// 최종 처리 average() 예제
public class AverageEx {
    public static void main(String[] args) {
        OptionalDouble avg = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .average();
        System.out.println("2의 배수의 평균 그대로: " + avg);
        System.out.println("2의 배수의 평균 orElse(0.25): " + avg.orElse(0.25));
        System.out.println("2의 배수의 평균 toString: " + avg.toString());
        System.out.println("2의 배수의 평균 getAsDouble(): " + avg.getAsDouble());
        double avg2 = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수의 평균: " + avg2);
    }
}
