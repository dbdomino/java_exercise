package com.javastudy.exam.object;

import java.util.Objects;

public class ObjectValue {
    int value;
    ObjectValue() {
        this.value = 2;
    }
    ObjectValue(int value) {
        this.value = value;
    }
    // object의 equals 메소드를 overriding해서 객체 주소를 비교하는게 아닌, 객체의 value값으 비교하도록 재구성
    public boolean equals(Object obj) {
        ObjectValue v = (ObjectValue) obj;// 다형성으로 형변환 지원
        return this.value == v.value;
    }
    // value의 값으로 hashcode출력하도록, equals도 값으로 비교하도록 수정했으니, HashCode도 값으로 HashCode화시킨걸 비교하기 위해
    public int hashCode() {
        return Objects.hashCode(value); //
    }
    // toString일 경우 인스턴스 변수가 출력되도록 overriding
    public String toString() {
        return "value:"+value;
    }

}
