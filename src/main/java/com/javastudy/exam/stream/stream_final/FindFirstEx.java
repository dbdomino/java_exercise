package com.javastudy.exam.stream.stream_final;

import java.util.Arrays;
// 최종 처리 findFirst 예제
public class FindFirstEx {
    public static void main(String[] args) {
        int first = Arrays.stream(new int[] {1, 2, 3, 4, 5})
                .filter(n -> n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수: " + first);
    }
}
