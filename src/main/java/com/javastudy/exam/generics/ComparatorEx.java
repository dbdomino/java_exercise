package com.javastudy.exam.generics;

import java.util.Arrays;
import java.util.Comparator;

// 정렬하려면, 1.정렬 대상  2. 정렬 기준 필요함.
public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬  sclass String implements java.io.Serializable, Comparable<String>, ....
        // 여기서 String은 Comparable<String>를 구현한 것으로, 기본 compareTo 메소드가 String에 구현되어 있어서 sort시 기본적인 정렬기준으로 별도지정 없어도 실행가능
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함, CASE_INSENSITIVE_ORDER = static 상수, 고정
        // 정렬기준이 String.CASE_INSENSITIVE_ORDER, 대소문자 구분없이 오름차순
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬
        // 사전순서의 역순 -> 기존 정렬 기준(오름차순)의 반대로 출력하겠다는 소리
        System.out.println("strArr=" + Arrays.toString(strArr));
        Arrays.sort(strArr, new Descending2()); // -1
//         -1 음수-> 오름차순(기본) 으로 정렬 하겠다는 소리
//         1 양수-> 내림차순 으로 정렬 하겠다는 소리
        System.out.println("strArr=" + Arrays.toString(strArr));
//        Double a=0;
        System.out.println("---------------------");
        Integer[] arr = { 30, 50, 10, 40, 20 };

        Arrays.sort(arr); // Integer가 가지고 있는 기본 정렬기준 compareTo()로 정렬
        System.out.println(Arrays.toString(arr));

        // sort(Object[] objArr, Comparator c)
        Arrays.sort(arr, new DescInt()); // DescComp에 구현된 정렬 기준으로 정렬
        System.out.println(Arrays.toString(arr));
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2){
        if( o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1 ; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
            // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
        }
        return -1;  // 비교할 수 없을 땐 -1 반환
    }
}
class Descending2 implements Comparator {
    public int compare(Object o1, Object o2){
        return 1;
//        return -9;  // 비교할 수 없을 땐 -1 , 음수, 오름차순  / 0은 내림차순, 1은 내림차순
    }
}

class DescInt implements Comparator {
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Integer && o2 instanceof Integer))
            return -1; // Integer가 아니면, 비교하지 않고 -1 반환

        Integer i  = (Integer)o1;
        Integer i2 = (Integer)o2;

        // return i2 - i; 또는 return i2.compareTo(i);도 가능
        return i.compareTo(i2) * -1; // 기본 정렬인 compareTo()의 역순으로 정렬
    }
}