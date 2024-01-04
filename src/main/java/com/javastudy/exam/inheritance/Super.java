package com.javastudy.exam.inheritance;

class Point {
    int x, y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    Point3D() {
        super(); // Point() 즉 부모의 생성자를 가져온다.
    }
    Point3D(int x, int y, int z) {
//        this(); // 자신의 다른 생성자를 가져오기도 가능하나, 생성자 가져오기는 첫 한줄만 가능
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
