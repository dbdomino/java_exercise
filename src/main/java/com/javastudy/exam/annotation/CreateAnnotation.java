package com.javastudy.exam.annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
@Target({TYPE, FIELD, METHOD})   // 적용대상이 FIELD, TYPE, TYPE_USE라는 소리
public @interface CreateAnnotation {
}

@CreateAnnotation
class TestMova {
    int i;
}
