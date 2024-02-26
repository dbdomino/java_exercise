package com.javastudy.exam.optional;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String str = "abcd efgh"; // null이 아닌 값을 가지는 문자열 변수
        String nullStr = null;
        Optional<String> optional = Optional.of(str); // Optional 객체 생성, 값이 null이 아니므로 of() 메서드 사용
//        Optional<String> optionalOf = Optional.of(nullStr); // of로 생성할 때 null이 드러가면 NullPointerException 생성
        System.out.println(optional); // 출력: Optional[abcd efgh]
        System.out.println(optional.toString()); // 출력: Optional[abcd efgh]
        System.out.println(optional.get()); // 출력: abcd efgh

        System.out.println("-----------------------------");
         // null 값을 가지는 문자열 -> empty로 출력
        Optional<String> optionalofNullable1 = Optional.ofNullable(str); // Optional 객체 생성, 값이 null이므로 ofNullable() 메서드 사용
        Optional<String> optionalofNullable2 = Optional.ofNullable(nullStr); // ofNullable 로 생성하면 null 들어가도 에러 안뱉음.
        System.out.println(optionalofNullable2); // 출력: Optional.empty
        System.out.println(optionalofNullable2.toString()); // 출력: Optional.empty
//        System.out.println(optionalNull.get()); // 에러, null은 get 시키지 못한다.
        System.out.println(optionalofNullable2.orElse("optionalNull orElse")); // empty나
        System.out.println("-----------------------------");
        Optional<String> optionalEmpty = Optional.empty(); // null 이 들어간 Optional
        System.out.println(optionalEmpty); // 출력: Optional.empty
        System.out.println(optionalEmpty.toString()); // 출력: Optional.empty
//        System.out.println(emptyOptional.get()); // 에러, empty()시킨 optional의 값을 get()하면 에러난다.
        System.out.println(optionalEmpty.orElse("optionalEmpty orElse")); // 빈값이나 null일 경우
        System.out.println(optionalEmpty); //
        System.out.println("-----------------------------");
        Optional<String> optionalEmpty2 = Optional.ofNullable(""); // 빈값을 넣음 Optional 객체 생성
        System.out.println(optionalEmpty2); // 출력: Optional[]
        System.out.println(optionalEmpty2.toString()); // 출력: Optional[]
        System.out.println(optionalEmpty2.get()); // 출력:   빈값으로 출력된다. "" 임
        System.out.println(optionalEmpty2.orElse("optionalEmpty2 orElse")); // 빈값""이나, null 이 아니므로 "" 출력

    }
}
