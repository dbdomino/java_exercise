package com.javastudy.exam.calendar;

import java.util.Calendar;

// add, 날짜(연월일) 이전 이후로 설정
// roll, 단순히 연/월/일 해당하는 것만 바꾸는 설정
public class CalendarAddRoll {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2019, 7, 31);	// 2019년 8월 31일

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("= 31일 후(roll) ="); // 31일 추가한다해도 연, 월에 영향주지 않음, 그게 roll
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)
                +"월 " + date.get(Calendar.DATE) + "일";
    }
}
