package com.javastudy.exam.generics;

/* 제네릭스의 제약
- 타입 변수에 대입은 인스턴스 별로 다르게 가능
Box<Apple> appleBox = new Box<Apple>();
Box<Grape> grapeBox = new Box<Grape>();
 */
//- static 멤버에 타입 변수 사용 불가능
class BoxPlastic<T> {
//    static T item; // 에러, 스태틱 멤버변수에는 제네릭스 지정 불가능하다. 클래스 선언시 만들어 져야 하기 때문
//    static int compare(T t1, T t2) { } //에러, 스태틱 메서드에 제네릭스 지정 불가능하다. 클래스 선언시 만들어 져야 하기 때문
    T[] objectArr; // 가능, T 타입의 배열 참조변수
//    T[] toArray() {
//        return new T[objectArr.length]();  // 에러, new로 제네릭 배열은 생성 불가능하다. new 다음에 T가 오면 안된다.
//        // 객체 배열이나 배열 생성 모두 안된다.
//    }
//    T toObject() {
//        return new T();  // 에러, new로 제네릭 객체는 생성 불가능하다. new 다음에 T가 오면 안된다.
//        // 객체 배열이나 배열 생성 모두 안된다. 뭐가올지 알수 없다보니, new로 붙이진 못함.
//    }
}

//- 배열 생성할 때 타입 변수 사용 불가, 타입 변수로 배열 선언은 가능

public class ArraysTests {
    public static void main(String[] args) {

    }
}
