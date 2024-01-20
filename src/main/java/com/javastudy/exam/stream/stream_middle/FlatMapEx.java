package com.javastudy.exam.stream.stream_middle;

import java.util.Arrays;
import java.util.List;
// flatMap 예제
public class FlatMapEx {
    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("java8 람다", "stream 매핑");

        // 중간 처리로, 각 요소의 단어를 띄어쓰기로 구분해서 출력하는 식 만들기
        inputList1.stream()
//                .flatMap(data -> Arrays.stream(data.split(" "))) // ArrayList를 스트림으로 받아, split(구분자) 수행,
                .flatMap(s -> Arrays.stream(s.split(" "))) // s는 ArrayList 안에 든 제네릭에 표시된 것, String이다.
                .forEach(word -> System.out.println(word));

        System.out.println();

        List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
        // String으로된 리스트를 받아서 이를 각각 int배열로 분리함
        inputList2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for(int i=0; i<strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim()); // trim을 넣어서 양끝 공백 없애고 숫자로 변환해서 집어넣는구나.
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));
    }
}
