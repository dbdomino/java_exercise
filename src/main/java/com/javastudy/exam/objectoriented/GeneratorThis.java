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
public class GeneratorThis {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}
