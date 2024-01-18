package com.javastudy.exam.annotation;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy = "", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"), testTools={"호호호","후후후","하하하"})
//@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class AnnotationCreate {
    public static void main(String args[]) {
        // 어노테이션을 불러오는 방법이,
        Class<AnnotationCreate> cls = AnnotationCreate.class; //클래스를 먼저 불러옴

        TestInfo anno = cls.getAnnotation(TestInfo.class); // 클래스에 붙어있는 어노테이션 클래스를 불러옴
        System.out.println("anno.testedBy()="+anno.testedBy());
        System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss());

        for(String str : anno.testTools())
            System.out.println("testTools="+str); // 여기선 한글로 입력된거 출력잘됨

        System.out.println();

        // Ex12_8에 적용된 모든 애너테이션을 가져온다.
        Annotation[] annoArr = cls.getAnnotations();

        for(Annotation a : annoArr)
            System.out.println(a); // 여기선 한글로 입력된거 유니코드로 변환되어 출력됨
        // 어노테이션 별로 출력하다보니 이런식으로 출력시키는 것으로 보임
    } // main의 끝
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface TestInfo {
    int       count()	  	default 1;  // 디폴트가 있는건 값 안적어줘도 괜찮다.
    String    testedBy();
    String[]  testTools() 	default "JUnit";
    TestType  testType()    default TestType.FIRST;
    DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
    String yymmdd();
    String hhmmss();
}

enum TestType { FIRST, FINAL }

