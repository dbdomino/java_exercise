package com.javastudy.exam.array;

import java.util.Arrays;

public class ArrayInt {
    public static void main(String[] args) {
        // 배열 int
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60}; // 이렇게도 선언은 가능
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        // 배열 출력 및 저장
        for (int i=0; i < iArr1.length ; i++ ) {
            iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
        }
        for (int i=0; i < iArr2.length ; i++ ) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i=0; i < iArr1.length;i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);

        int   sum = 0;      // 총점을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length ; i++ ) {
            sum += score[i];
        }
        average = sum / (float)score.length ; // 계산결과를 float로 얻기 위해서 형변환

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
