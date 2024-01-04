package com.javastudy.exam.inheritance;

class Point {
    int x, y;

    Point() {
        // 첫줄에 생성자 생략할 경우 컴파일러가 자동으로 super(); 를 넣어준다. 여기선 extends Object 이므로
        // super(); => Object 클래스의 Object(); 가 해당될 것이다.

    }
// 이런식의 생성자를 하나 생성해두면, 기본생성자 Point()는 생성하지 않는다. 그러므로 다른데서 Point 클래스를 상속할 경우
    // 생성자 부분에서 에러 발생할 수 있으므로 기본생성자는 왠만해선 직접 구현하자.
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    Point3D() {
//        super(); // 즉 부모의 생성자  Point()를 가져온다. Point 클래스에서 Point() {} 불러옴
        //super();를 주석치면 컴파일 에러 발생, There is no default constructor available in 'com.javastudy.exam.inheritance.Point'
        //자바의 특성임, 첫 줄에서 무조건 발생, 생략할 경우 super(); 를 컴파일러가 넣어준다.
    }
    Point3D(int x, int y, int z) {
//        this(); // 첫 줄에서 생성자 가져오기 무조건 발생 기입할 경우 기입대로 실행,
//        생략할 경우 super(); 를 컴파일러가 넣어준다.
        super(x, y); // Point(int x, int y) 즉 부모의 생성자를 가져온다.
        this.z = z;

    }
}
public class Super {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        System.out.println("x=" + p1.x + ",y=" + p1.y + ",z=" + p1.z);

        Point3D p2 = new Point3D();
        System.out.println("x=" + p2.x + ",y=" + p2.y + ",z=" + p2.z);
        p2.z = 5;
        System.out.println("x=" + p2.x + ",y=" + p2.y + ",z=" + p2.z);
    }
}
