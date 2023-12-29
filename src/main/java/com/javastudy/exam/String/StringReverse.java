package com.javastudy.exam.String;

public class StringReverse {
    public static void main(String[] args) {
        // 문자열
        String str = "가나다라마";
        // 문자열 reverse
        String reverse = "";
        // charAt : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해줌
        // https://wikidocs.net/205
        for (int i = str.length() - 1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
        // 결과 출력
        System.out.println(reverse); // "문자 뒤집어져나옴"

        // StringBuffer 로 만들어 뒤집기
        // StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형 https://wikidocs.net/276
        StringBuffer sb = new StringBuffer(str);
        String reverseB = sb.reverse().toString();

        // 결과 출력
        System.out.println(reverseB); // "문자 뒤집어져나옴"


    }
}
