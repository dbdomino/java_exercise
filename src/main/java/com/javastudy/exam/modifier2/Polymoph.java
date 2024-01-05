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
    String text = "hoh";
    void caption(String msg) {
        System.out.println(msg);
    }

    void dowork(Tv t) {
        if (t instanceof SmartTv) {
            caption("SmartTv check");
        } else {
            caption("no SmartTv check");
        }
    }
}
class CustomTv extends Tv{
    // 안에 아무것도 없어도 안되네
    void dowork(Tv t) {
        if (t instanceof CustomTv) {
            motion("CustomTv check");
        } else {
            motion("no CustomTv check");
        }
    }
    void motion(String msg) {
        System.out.println(msg);
    }
}

public class Polymoph {
    public static void main(String[] args) {
        Tv t = new SmartTv(); // 가능, 부모 타입의 참조변수로 자손 타입 객체를 가리킬 수 있다.
//        SmartTv st = new Tv();  // 불가능, 자식 타입의 참조변수로 부모 타입 객체를 가리킬 수 없다.
        // 자식타입이 객체가 같거나 더 많기 때문에 불가능
//        CustomTv ct = new Tv(); // 불가능, 자식 타입의 참조변수로 부모 타입 객체를 가리킬 수 없다.

        // 참조 변수의 형변환
        SmartTv st2 = new SmartTv();
        Tv t2 = st2; // SmartTv 인스턴스 형변환 자동으로 가능, t2는 st2를 가리킴
//        SmartTv st3 = t2;
        SmartTv st3 = (SmartTv) t2; // Tv 인스턴스 형변환 명시적으로 가능 st3는 st2를 가리킴
        SmartTv st4 = (SmartTv) t; // 부모에서 자식으로 형변환하려면 명시반드시해야함. st4는 t인 SmartTv 객체를 가리킴
        st3.caption("st3"); // 가능 st2의 객체 메소드를 사용하는 것임
        st4.caption("st4"); // 가능 t의 객체 메소드를 사용하는 것임

        // instanceof 연산자
        // 참조변수의 형변환 가능한지 확인함, 가능하면 true 반환
        // 참조변수의 형변환을 쓰려면 instanceof로 확인시키고 써야한다.
        Tv t4 = new Tv();
        CustomTv ct = new CustomTv();
        st2.dowork(t); // 이처럼 부모 타입을 매개변수로 받는 메소드일 경우 부모, 자식형식 모두 지원이 된다, 다형성의 특성
        st2.dowork(st2); // 이를 정확히 구분해서 형변환 기능을 구현하려면, instanceof 를 써야한다.
        st2.dowork(ct);
        st2.dowork(t4); // t4는 Tv 객체를 참조하므로 no가 맞음

        ct.dowork(t); // t는 smartTv 객체를 참조하므로 여기선 no가 맞음
        ct.dowork(st2);
        ct.dowork(ct);
        ct.dowork(t4);
    }
}
