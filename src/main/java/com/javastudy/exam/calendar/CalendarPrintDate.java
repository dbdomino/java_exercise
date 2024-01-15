package com.javastudy.exam.calendar;

import java.util.Calendar;

public class CalendarPrintDate {
    public static void main(String[] args) {
        int year  = Integer.parseInt("2023");
        int month = Integer.parseInt("12");
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝일

        // 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
        // 예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1);과 같이 해줘야 한다.
        sDay.set(year, month-1, 1);  // 해당달의 첫째날 설정
        eDay.set(year, month, 1);  // 해당달의 다음달 첫째날 설정, 이후에 day를 -1해서 해당달의 마지막날로 설정할거임

//        System.out.println(sDay.get(Calendar.YEAR) +" "+sDay.get(Calendar.MONTH) + " "+ sDay.get(Calendar.DATE));
//        System.out.println(eDay.get(Calendar.YEAR) +" "+eDay.get(Calendar.MONTH) + " "+ eDay.get(Calendar.DATE));

        // 다음달의 첫날(12월 1일)에서 하루를 빼면 현재달의 마지막 날(11월 30일)이 된다.
        eDay.add(Calendar.DATE, -1);

        // 첫 번째 요일이 무슨 요일인지 알아낸다.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        // eDay에 지정된 날짜를 얻어온다.
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " + year +"년 " + month +"월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
        // 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작)
        for(int i=1; i < START_DAY_OF_WEEK; i++) // 첫째주 공백찍기 부터
            System.out.print("   ");

        for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { // 그뒤에
            System.out.print((i < 10)? "  "+i : " "+i );
            if(n%7==0) System.out.println();
        }
    }
}
