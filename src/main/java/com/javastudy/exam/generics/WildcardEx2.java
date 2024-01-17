package com.javastudy.exam.generics;

import java.util.ArrayList;

class Fruit2		       	{ Fruit2() {} public String toString() { return "Fruit";}}
class Apple2 extends Fruit2	{ Apple2() {} public String toString() { return "Apple";}}
class Grape2 extends Fruit2	{ Grape2() {} public String toString() { return "Grape";}}

class Juice {
    String name;

    Juice(String name)       { this.name = name + "Juice"; }
    public String toString() { return name;                }
}

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}
class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i);  }
    ArrayList<T> getList() { return list;   }
    int size()       { return list.size();  }
    public String toString() { return list.toString();}
}
public class WildcardEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        // 와일드카드 적용하면, Fruit2, Apple2, Grape2 제네릭 타입 모두 다룰 수 있다.
        FruitBox2<? extends Fruit2> mixBox = new FruitBox2<Apple2>();
//        mixBox = new FruitBox2<Fruit2>(); // 가능
//        mixBox = new FruitBox2<Apple2>(); // 가능
//        mixBox = new FruitBox2<Grape2>(); // 가능

//        mixBox.add(new Grape2()); //에러 위에 메소드 선언까진 되는데, add가 안되는듯
//        mixBox.add(new Apple2()); //에러
//        mixBox.add(new FruitBox2()); //에러

        //  static Juice makeJuice(FruitBox2<? extends Fruit2> box)
        // 스테틱 메서드에서 제네릭스의 와일드카드는 메소드의 파라미터에서 쓰일 수 있다.
        // <? extends Fruit2>

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }  // main
}
