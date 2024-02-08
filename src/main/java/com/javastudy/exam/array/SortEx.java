package com.javastudy.exam.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortEx {
    public static void main(String[] args) {
        int[] arr = {6,3,2,1,5};
        String[] arr2 = {"h", "e", "a", "c"};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        // String 정렬 내림차순
        Arrays.sort(arr2, Collections.reverseOrder());
        // int 타입 정렬
        Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
         // 또는
        int[] arr4 =  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
}
