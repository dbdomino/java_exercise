package com.javastudy.exam;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AssertJTests {
//    @Test
    void a_few_simple_assertions() {
        // 메서드 체이닝 assertJ지원
        assertThat("The Lord of the Rings").isNotNull()
                .startsWith("The")
                .contains("Lord")
                .endsWith("Rings");



    }

//    @Test
    void a_few_simple_assertions3() {
        String a = "aa";
        String b = "aa";
        // 1. org.junit.jupiter.api.Assertions.assertEquals;
        assertEquals(a, b);
        // 2. org.assertj.core.api.Assertions.assertThat;
        assertThat(a).isEqualTo(b);
        // assertJ의 문법인 2가 좀더 구분이 편하다.

        // AssertJ
        assertThat(b).contains("a");

    }

    @Test
    void a_few_simple_assertions4() {
        String a = "aa";
        String b = "aa";
        String[] bArr = {"aa", "abb", "bb"};

        List<String> aList = new ArrayList<>();
        aList.add("aa");
        aList.add("abb");
        aList.add("bb");

        assertArrayEquals(bArr, aList.toArray()); // 배열비교
    }

}
