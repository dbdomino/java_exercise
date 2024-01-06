package com.javastudy.exam.Interface;

abstract public class Unit {
    int x, y;
    abstract void move(int x, int y); // 추상메소드,
    void stop() { /* 현재 위치에 정지 */ }
}