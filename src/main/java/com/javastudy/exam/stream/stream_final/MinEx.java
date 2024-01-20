package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
import java.util.OptionalInt;

// 최종 처리 min 예제
public class MinEx {
    public static void main(String[] args) {
        int min = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .min()
                .getAsInt();
        System.out.println("최소값: " + min);
        OptionalInt mino = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%2==0)
                .min();

        System.out.println("최소값 OptionalInt: " + mino);
        System.out.println("최소값 getAsInt(): " + mino.getAsInt());
    }
}
