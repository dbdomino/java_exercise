package com.javastudy.exam.modifier2;

// 다형성(polymorphism)
// 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

}
class SmartTv extends Tv{
    String text;
    void caption(String msg) {
        System.out.println(msg);
    }
}
class CustomTv extends Tv{
    // 안에 아무것도 없어도 안되네
}

public class Polymoph {
    public static void main(String[] args) {
        Tv t = new SmartTv(); // 가능, 부모 타입의 참조변수로 자손 타입 객체를 가리킬 수 있다.
//        SmartTv st = new Tv();  // 불가능, 자식 타입의 참조변수로 부모 타입 객체를 가리킬 수 없다.
        // 자식타입이 객체가 같거나 더 많기 때문에 불가능
//        CustomTv ct = new Tv(); // 불가능, 자식 타입의 참조변수로 부모 타입 객체를 가리킬 수 없다.
    }
}
