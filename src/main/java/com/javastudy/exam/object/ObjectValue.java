package com.javastudy.exam.object;

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

}
