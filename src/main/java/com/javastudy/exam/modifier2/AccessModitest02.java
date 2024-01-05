package com.javastudy.exam.modifier2;

import com.javastudy.exam.modifier.AccessModitest01;

class MyParent02 extends AccessModitest01 {

    public void printMembers() {
//        System.out.println(prv);// private 라서 자식에서 못씀
//        System.out.println(dft);// default 라서 다른패키지라 자식이라도 못씀
        System.out.println(prt);// protected 라서 자식에서 가능
        System.out.println(pub);

    }



}

public class AccessModitest02 {
    public static void main(String args[]) {
        AccessModitest01 p1 = new AccessModitest01();
//        System.out.println(p1.prv); // 에러, private 라서
//        System.out.println(p1.dft); // 에러, 다른패키지라 불가능
//        System.out.println(p1.prt); // 에러, 다른패키지이고 자손밖에서는 못꺼냄
        System.out.println(p1.pub); // 바로 호출은 public 가능

        p1.printMembers2();
    }
}
