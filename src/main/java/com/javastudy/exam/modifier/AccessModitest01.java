package com.javastudy.exam.modifier;

public class AccessModitest01{
    private int prv; // 같은클래스
            int dft; // 같은 패키지
    protected int prt; // 같은 패키지, 자손(다른패키지까지)
    public int pub; // 접근제한없음

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }

    public void printMembers2() {
//        System.out.println(prv);// private 라서 자식에서 못씀
//        System.out.println(dft);// default 라서 다른패키지라 자식이라도 못씀
        System.out.println(prt);// protected 라서 자식에서 가능
        System.out.println(pub);

    }
}
class MyParent00 extends AccessModitest01 {
    public void printMembers() {
//        System.out.println(prv); // private 라서 자식에서 못씀
        System.out.println(dft); // default 라서 같은패키지라 가능
        System.out.println(prt); // protected 라서 자식에서 가능
        System.out.println(pub); // 걍가능
    }
}

class MyParent01 {
    public static void main(String args[]) {
        AccessModitest01 p1 = new AccessModitest01();
//        System.out.println(p1.prv); // 에러, private 라서
        System.out.println(p1.dft); // 바로 호출은 default 가능
        System.out.println(p1.prt); // 바로 호출은 protected 가능
        System.out.println(p1.pub); // 바로 호출은 public 가능

        p1.printMembers(); // 이상없이 private 변수 system.out.println에 동작

    }
}
