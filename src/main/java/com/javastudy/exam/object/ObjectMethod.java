package com.javastudy.exam.object;

public class ObjectMethod {
    public boolean equals(Object obj) {
        return (this==obj); // 객체의 주소가 같을경우 참
    }

    public native int hashCode(); // 네이티브 메서드, OS의 메서드(C언어)를 자바에서 쓸수있도록 해주는 메서드

}
class ObjectMethod2 {
    public boolean equals(Object obj) {
        return (this==obj);
    }
}
