package com.javastudy.exam.enums;

public class EnumSingletonEx {
    public static void main(String[] args) {
//        EnumSingleton es =EnumSingleton.getInstance();
        EnumSingleton es =EnumSingleton.INSTANCE; // 메소드가 아니라 INSTANCE로 바로 불러오는 것.
        es.print();
    }

}
