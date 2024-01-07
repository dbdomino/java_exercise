package com.javastudy.exam.Interface;
// 인터페이스의 다형성 지원
// 인터페이스도 구현 클래스의 부모 역할을 할 수 있다.
// 인터페이스 타입 매개변수를 구성하면, 인터페이스 구현한 클래스의 객체만 사용한다는 소리다.
abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("Unit2 멈춥니다.");
    }
}
interface Unit2Interface { // 인터페이스의 모든 메서드는 예외없이 public abstract
    void move(int x, int y); // public abstract 생략된 추상메소드

    void attack(Unit2Interface ui); //  public abstract 생략된 추상메소드
    // 인터페이스 타입 매개변수(Unit2Interface ui)를 구성하면, 인터페이스 구현한 클래스의 객체만 사용한다는 소리다.
}
class Fighter extends Unit2 implements Unit2Interface{
    // 오버라이딩 규칙 : 조상(public) 보다 접근제어자 범위가 좁으면 안된다.
    // 인터페이스에서 오버라이딩 된 메소드는 public이 될 수 밖에 없네.
    public void move(int x, int y) {
        System.out.println("이동하다 x"+x+", y"+y);
    }

//    public void attack(Fighter ui) { } // 만약 이거만 있으면 에러난다, attack(Unit2Interface ui)를 오버라이딩 시켜서 구현안해줘서 그렇다.
    public void attack(Unit2Interface ui) {
        System.out.println("Fighter 공격하다 ui > " + ui);
    }
}
public class InterfacePoly {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(101, 202);
        Fighter f2 = new Fighter();
        f.attack(f2); // Unit2Interface 인터페이스 타입이지만 f2는 Fighter()로 Unit2Interface를 구현한 것이라서 다형성 지원으로 가능한 소스

        Unit2 u = new Fighter(); // fighter객체의 조상인 unit2 형식으로 참조
//        u.attack(f2); //에러, Unit2에는 attack()이 없기 때문
//        f.attack(u); //에러, Unit2 클래스는 Unit2Interface 와 관련이 없기때문
        Unit2Interface ui = new Fighter(); // fighter객체의 조상인 unit2 형식으로 참조
        ui.move(102, 204);
        ui.attack(f2); // 성공, 클래스 일 때 처럼 Unit2Interface에 attack이 미완성이지만 선언 되어있어
        // 메소드 사용 가능, ui는 fighter 객체를 참조하므로 참조된 객체의 메서드로 실행됨.
        // 즉, 인터페이스도 구현 클래스의 부모로써 역할을 가질 수 있고, 이로 인해 인터페이스(부모), 구현객체(자손)간 다형성을 지원한다.

    }
}
