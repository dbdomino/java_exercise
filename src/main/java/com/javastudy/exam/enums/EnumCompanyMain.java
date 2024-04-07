package com.javastudy.exam.enums;

public class EnumCompanyMain {
    public static void main(String[] args) {

        System.out.println(EnumCompany.SAMSUNG);
        System.out.println(EnumCompany.SAMSUNG.valueOf("ho")); // SAMSUNG 내부에 String value 없으므로 에러.
        System.out.println(EnumCompany.SAMSUNG.getClass());
        for(EnumCompany type : EnumCompany.values()){ // enum 선언된거 하나씩 다 긁어옴.
            System.out.println(type); // SK, LG, KT, SAMSUNG, APPLE
        }
        System.out.println("------------------");
        System.out.println(EnumCard.Kind.valueOf("CLOVER")); // kind
    }
}
