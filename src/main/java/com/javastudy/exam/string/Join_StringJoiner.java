package com.javastudy.exam.string;

import java.util.StringJoiner;

public class Join_StringJoiner {
    public static void main(String[] args) {
        // 길이가 0인 char배열을 생성한다.
        char[] cArr = new char[0];    // char[] cArr = {};와 같다.
        String sc = new String(cArr);  // String s = new String("");와 같다.

        System.out.println("cArr.length="+cArr.length); // 문자열 길이 붙여서 출력
        System.out.println("@@@"+sc+"@@@"); // 문자열 sc (빈문자열) 합쳐서 출력
//-------------------------------------------------------
        String animals = "dog,cat,bear";
        String[] arr   = animals.split(","); // 구분자를 넣어서 arr 에 나눠 저장

        System.out.println(String.join("-", arr)); // join 메소드 배열에 구분자 - 넣어서 join 결합, 합치기

        StringJoiner sj = new StringJoiner("/","[","]"); // StringJoiner 형식 구분자, prifix, suffix 설정
        // 이후 add로 추가하여 출력가능
        for(String s : arr)
            sj.add(s);

        System.out.println(sj);
        System.out.println(sj.toString());
    }
}
