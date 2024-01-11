package com.javastudy.exam.Interface;

class DefaultObject implements DefaultMethod {
    @Override
    public void abstractMethodA() {   }
    @Override
    public void abstractMethodB() {   }
    @Override
    public void abstractMethodC() {   }
}

class DefaultObject2 extends MotherDefualt implements DefaultMethod  {
    @Override
    public void abstractMethodA() {   }
    @Override
    public void abstractMethodB() {   }
    @Override
    public void abstractMethodC() {   }
}

class DefaultObject3 extends MotherDefualt implements DefaultMethod, DefaultMethod2  {
    public void abstractMethodA() {   }
    public void abstractMethodB() {   }
    public void abstractMethodC() {   }
    public void abstractMethodD() {   }
    public void abstractMethodE() {   }
    public void abstractMethodF() {   }
}

class DefaultObject4 implements DefaultMethod, DefaultMethod3  {
    public void abstractMethodA() {   }
    public void abstractMethodB() {   }
    public void abstractMethodC() {   }

    @Override
    public int defaultMethodA() {
        return DefaultMethod.super.defaultMethodA();
    }

    @Override
    public void abstractMethodD() {

    }

    @Override
    public void abstractMethodE() {

    }

    @Override
    public void abstractMethodF() {

    }
}
class MotherDefualt {
    public int defaultMethodA(){
        System.out.println( " MotherDefualt defaultMethodA ");
        return 1;
    }
}
public class DefaultCreate {
    public static void main(String[] args) {
        DefaultObject a = new DefaultObject(); // 디폴트 메서드는 DefaultObject 에 구현 안해줘도 오류가 생기지 않는다,
        // 구현 원하는 구현체에만 메소드 추가가 필요한 경우, 디폴트 메서드를 사용한다.
        a.defaultMethodA(); // override 없어도 메소드 선언 가능하다.

        DefaultObject2 b = new DefaultObject2(); //
        b.defaultMethodA(); // extends MotherDefualt와 Implements DefaultMethod 의 메소드 정의 defaultMethodA 가 충돌,
        // 인터페이스의 디폴트 메소드보다, 상속된 메소드를 우선순위로 구현시킨다.

        DefaultObject3 c = new DefaultObject3(); //
        c.defaultMethodA(); // extends MotherDefualt와 Implements DefaultMethod, DefaultMethod2 의 메소드 정의 defaultMethodA 가 충돌,
        // 인터페이스들의 디폴트 메소드보다, 상속된 메소드를 우선순위로 구현시킨다.
    }
}
