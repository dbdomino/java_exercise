package com.javastudy.exam.modifier2;
// 매개변수의 다형성
// 다형성 테스트 및 장점
// 장점1 메소드의 매개변수를 부모 형식으로 받아와 필요한 매개변수만 선택적으로 가져와 사용할 수 있음.
// 장점 2 조상타입의 배열에 자손들의 객체를 담아 배열을 만드는게 가능하다.(이것도 필요한 매개변수만 선택적으로 가져와 사용 가능)
class Product {  // 부모클래스
    int price;			// 제품의 가격
    int bonusPoint;	// 제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
    }
}

class Tv1 extends Product { // 자식클래스
    Tv1() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100);		// Tv의 가격을 100만원으로 한다.
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() { return "Tv"; }
}

class Computer extends Product { //자식 클래스
    Computer() { super(200); } //가격 200만원

    public String toString() { return "Computer"; }
}
class Audio extends Product { //자식 클래스
    Audio() { super(100); } //가격 100만원

    public String toString() { return "Audio"; }
}

class Buyer {	// 고객, 물건을 사는 사람
    int money = 1000;	  // 소유금액
    int bonusPoint = 0; // 보너스점수

    Buyer() {}
    Buyer(int money) {this.money = money;}

    void buy(Product p) { // 여기가 핵심, 멤버변수가 Product p인데 여기다가 자식클래스들을 집어넣어도 지원이 된다는거. 참조변수의 형변환 지원기능
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class Polymophism {
    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

        Product p1 = new Tv1();
        Product p2 = new Computer();
        Product p3 = new Audio();

        // 이처럼 Product(부모) 타입의 배열에 자손 객체를 각각 담을 수 있다.
        Product[] p = new Product[3];
        p[0] = new Tv1();
        p[1] = new Computer();
        p[2] = new Audio();
    }
}
