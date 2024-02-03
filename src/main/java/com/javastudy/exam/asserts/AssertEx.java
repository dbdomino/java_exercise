package com.javastudy.exam.asserts;
// assert를 사용하기 위한 조건으로 -ea 옵션 추가해야함.
// 주로 junit에서 테스트할 때 사용합니다.
public class AssertEx {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("a : "+a);
        assert a<5:"assert 에 걸림";
        System.out.println("assert pass!  a: "+a);
        /*

        assertEquals(expected, actual);
        assertThat(actual).isEqualTo(expected);

         */
    }
}
