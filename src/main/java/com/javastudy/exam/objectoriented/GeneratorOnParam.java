package com.javastudy.exam.objectoriented;

class Car {
    String color;		// 색상
    String gearType;	// 변속기 종류 - auto(자동), manual(수동)
    int door;			// 문의 개수

    Car() {}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class GeneratorOnParam {
    // 매개변수가 있는 생성자
    public static void main(String[] args) {
        Car c1 = new Car();
    // 객체타입  객체이름 = 신규생성 기본생성자;
        c1.color    = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
    // 객체타입  객체이름 = 신규생성 매개변수있는생성자;
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}
