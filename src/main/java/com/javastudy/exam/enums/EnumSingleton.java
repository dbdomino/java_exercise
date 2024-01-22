package com.javastudy.exam.enums;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() { return INSTANCE; }
    public void print() { System.out.println("위이잉~ 프린트 완료"); }
}
