package com.javastudy.exam;

import org.junit.jupiter.api.Test;

public class AnnotationTests {
    // @Test 로 지정된 메소드들의 실행 순서는 아래 소스의 순서와 일치되지 않는다.
    // 각 메소드별로 @Test가 붙은 것들이 실행되며 테스트 할 수 있다.

    @Test
    public void hellotests() {
        System.out.println("hello tests work!");
    }

//    @Test
    public void sotests() {
        System.out.println("soso tests work!");
    }

    @Test
    public void kimchitests() {
        System.out.println("kimchi tests work!");
    }
}
