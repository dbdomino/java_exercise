package com.javastudy.exam.generics;

import java.util.ArrayList;

// 제네릭스 클래그의 제네릭스 화용방법
class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}
// extends로 대입할 수 있는 타입을 상속관계 인 것만 받도록 제한할 수 있다.
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

// 인터페이스/클래스를 상속받는 것들을 T로 받겠다고 제한 가능
// 인터페이스라고해서 implements 쓰지않음.
//class FruitBox<T extends Fruit & Eatable> extends Box<T> {} // 이것도 가능하나  Eatable은 Fruit에 선언되어 있어서 생략가능
class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);     }
    T get(int i)     { return list.get(i); }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}

public class GenericsClassEx {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox   = new FruitBox<Toy>();   // 에러.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }  // main
}
