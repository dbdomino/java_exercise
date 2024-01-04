package com.javastudy.exam.inheritance;
// 오버로딩 같은 메소드이름에 다른 매개변수를 두고 동일한 메서드 이름을 재사용. (리턴형이나 접근제한은 상관없으나, 매개변수는 반드시 달라야함)
// 오버라이딩, 상속받은 조상의 메서드를 자신에 맞게 변경하는 것.
/* 오버라이딩의 조건
1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
 */
// class Mypoint3 extends Object { 와 같음, Object에서 제공하는 toString을 변형해서 사용해보자.
class MyPoint3 {
    int x;
    int y;

    // Object 클래스의 toString을 오버라이딩
    public String toString() {
        return "x:"+x+", y:"+y;
    }
    // 커스텀 메소드
    public String pl() {
        return "x:"+x+", y:"+y;
    }
}
class MyPoint4 extends MyPoint3{
    int z;
    // MyPoint3의 pl()을 오버라이딩
    public String pl() {
        return "x:"+x+", y:"+y+", z:"+z;
    }
}
public class Overriding {
    public static void main(String[] args) {
        MyPoint3 p3 = new MyPoint3();
        p3.x = 5;
        p3.y = 7;
        System.out.println(p3.toString()); // 오버라이딩 없으면 com.javastudy.exam.inheritance.MyPoint3@4b85612c 이렇게 Object의 고유기능인 객체의 참조주소값이 나옴
        System.out.println(p3.pl()); // 오버라이딩 없으면 com.javastudy.exam.inheritance.MyPoint3@4b85612c 이렇게 Object의 고유기능인 객체의 참조주소값이 나옴
        p3.pl();
        MyPoint4 p4 = new MyPoint4();
        p4.x = 4;
        p4.y = 8;
        p4.z = 12;
        System.out.println(p4.pl());

    }
}
