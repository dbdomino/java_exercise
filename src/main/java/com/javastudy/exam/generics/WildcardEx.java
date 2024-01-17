package com.javastudy.exam.generics;


import java.util.ArrayList;
import java.util.List;

class Product {  // 부모클래스
    int price;			// 제품의 가격
    int bonusPoint;	// 제품구매 시 제공하는 보너스점수

    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
    }
}
class Tv extends Product { // 자식클래스
    Tv() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);		// Tv의 가격을 100만원으로 한다.
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() { return "Tv"; }

}

public class WildcardEx {
    public static void main(String[] args) {

        ArrayList<Product> listP1 = new ArrayList<Product>(); // 매개변수로 들어갈 때 다형성은 지원하나 제네릭스는 Product로 일치시켜줘야함.
        listP1.add(new Tv());
        listP1.add(new Product());
        ArrayList<Tv> listT1 = new ArrayList<Tv>(); // Tv가 Puoduct를 상속받았지만, 넣을때 부모타입으로 넣을수는 없다.
        // 형변환 해주지 않으면 에러 발생
        listT1.add(new Tv());
//        listT1.add((Tv) new Product()); // 부모가 자식으로 형변환은 불가능
//      ArrayList<Product> list = new ArrayList<Tv>(); // Tv가 Puoduct를 상속받았지만 에러남.
        // 와일드카드 ? 를 써서 적힌 참조변수와 대입된 타입이 다른 객체를 참조할 수 있게 된다.
        // 다만 조건으로 메서드의 매개변수에 와일드카드 사용이 가능하다.
        List<? extends Product> listT2 = new ArrayList<Tv>();
//        listT2.add(new Tv());  // 아래까지 모두 에러, 와일드카드 선언은 클래스안에서 해야한다.
//        listT2.add(new Product());

    }
}
