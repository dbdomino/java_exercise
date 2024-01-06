package com.javastudy.exam.abstracts;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AbstractClassBenefit {
    public static void main(String[] args) {
//        추상화된 코드는 구체화된 코드 보다 유연하다. 변경에 유리하다.
        GregorianCalendar cal = new GregorianCalendar(); // 구체적, 그대로 사용가능함.. 다만 해당하는 조건에서만 사용가능
        // Calendar 는 추상클래스다.
        Calendar cal2 = Calendar.getInstance(); // 추상적, 캘린더 객체를 반환, Calendar 객체는 추상클래스,

    }
/*
    private static Calendar getInstance(Locale aLocale) {
        return createCalendar(TimeZone.getDefault(), aLocale);
    }
*/
/* // Calendar 는 추상클래스다.
추상화의 개념을 이용하여, Calendar 참조형식으로 반환하는 것인데, 안에 참조된 객체는 상황(caltype 값)에 따라
BuddhistCalendar, JapaneseImperialCalendar, GregorianCalendar 처럼 유연하게 만들어 내보낼 수 있다.
// 이후 형변환으로 사용할 수도 있을거고, 참조 변수들로 활용도 가능할 것이다.

    private static Calendar createCalendar(TimeZone zone, Locale alocal) {
        if (caltype != null) {
            switch (caltype){
                case "buddhist":
                    cal = new BuddhistCalendar(zone, alocal);
                    break;
                case "japanese":
                    cal = new JapaneseImperialCalendar(zone, alocal);
                    break;
                case "gregory":
                    cal = new GregorianCalendar(zone, alocal);
                    break;
            }
        }
    }
*/
}
