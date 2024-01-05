package com.javastudy.exam.modifier;

class Time {
    private int hour;  // private으로 하면 클래스 내부에서만 사용 가능
    private int minute;
    private int second;

    public void printHour(){
        System.out.println(hour);
    }

    // 일반적으로 private로 변수 직접 참조를 차단하고, setter와 getter로 값을 할당하는데, setter를 선언하지않고 초기화로 한번만 할당하는 경우도 있음.
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;

        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
public class Capsule {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(100);
        t.printHour();
    }
}
