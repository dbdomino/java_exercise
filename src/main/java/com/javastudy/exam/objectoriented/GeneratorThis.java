package com.javastudy.exam.objectoriented;

class Car2 {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    // 생성자에서 다른 생성자를 호출시킬 수 있음.
    Car2() {
        this("white", "auto", 4);
    }
    // this로 생성자, 다른생성자 호출하기
    Car2(String color) {
//        this.door = 555;
//        this(color, "auto", 4); // 컴파일에러, 생성자에서 다른 생성자를 호출하려면, 맨 첫 줄에서만 가능하다.
        this(color, "yeallo", 555); // this로 생성자를 호출하는게 가능하다.
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

// 참조변수 this
// 인스턴스 자신을 가리키는 참조변수.
// 인스턴스 메서드(생성자 포함)에서 사용가능
// 지역변수(local v)와 인스턴스변수(instance v)를 구분할 때 사용, this가 붙은건 iv(인스턴스변수)
public class GeneratorThis {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}
