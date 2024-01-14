package com.javastudy.exam.calendar;

import java.text.DecimalFormat;

// 문자열-> 숫자로 바꾸는데, Parse 바꿀 패턴 설정.
// 숫자 -> 문자열 바꾸는데, Format 패턴 설정
public class DecimalFormatEx {
    public static void main(String[] args) throws Exception {
        DecimalFormat df  = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89"); // 문자열 -> 숫자로 변환, parse
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num)); // 숫자 -> 문자열로 변환, format
            System.out.println(String.valueOf(Double.toString(d)));  // 숫자 -> 문자열로 변환, toString
            /*
            두 메소드 모두 Object의 값을 String으로 변환하지만 변경하고자 하는 Object가 null인 경우 다르다.
toString()과 같은 경우 Null PointerException(NPE)을 발생시키지만 valueOf는 "null"이라는 문자열로 처리한다.
             */
//            System.out.println(String.valueOf(Number.toString(num)));
            System.out.println("-------------------");
        } catch(Exception e) {}
//        System.out.println(Double.parseDouble(String.valueOf(df2)));  // 에러

        double number  = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.000000000E0",
                "00.00000000E0",
                "000.0000000E0",
                "#.#########E0",
                "##.########E0",
                "###.#######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###",
        };

        for(int i=0; i < pattern.length; i++) {
            DecimalFormat df3 = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n",pattern[i], df3.format(number));
        }
    } // main
}
