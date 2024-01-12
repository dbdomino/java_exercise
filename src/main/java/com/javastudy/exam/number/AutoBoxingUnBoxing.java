package com.javastudy.exam.number;

// jdk 1.5부터 나옴,
// int 기본형, Integer 참조형
// 기본형의 값을 객체로 자동변환 하는 것을 오토박싱
// 참조형의 객체를 값으로 자동 변환 하는 것을 언박싱 이라고함
public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        int i = 5;
//        Integer iObj = new Integer(7); // jdk 9부터 사용안함.
//        int sum = i + iObj; // 만약 사용된다면, 이런식으로 컴파일러가 int sum = i + iObj.intValue(); 로 바꿔줘서 합이 가능해짐.

        // 기본형 -> 참조형으로 형변환 가능함.(컴파일러가 오토박싱 지원함)
         Integer intg = (Integer)i;   //
        System.out.println(intg);
        Object obj = (Object) i;
        System.out.println(obj.toString() + obj);

        // 참조형 -> 기본형으로 형변환 가능함.(언박싱)
        Long lng = 100L;   // 참조형
        long l = 20;  // 기본형
        System.out.println(l + lng); // 컴파일러가 언박싱을 지원하여 기본형 + 참조형간 덧샘 지원

    }
}
