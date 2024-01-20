package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.OptionalInt;

// 최종처리 max 예제
public class MaxEx {
    public static void main(String[] args) {
        int max = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .max()
                .getAsInt();
        System.out.println("최대값: " + max);
        OptionalInt maxO = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .max();
        System.out.println("최대값 getAsInt(): " + maxO.getAsInt());
        System.out.println("최대값 OptionalInt: " + maxO);
    }
}
