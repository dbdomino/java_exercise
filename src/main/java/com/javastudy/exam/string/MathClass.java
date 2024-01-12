package com.javastudy.exam.string;
/*
수학관련 static ㅋ메서드의 집합

round()로 원하는 소수점 아래 세 번째 자리에서 반올림하기
1. 원래값에 100을 곱한다.
2. 위의 결과에 Math.round()를 사용한다.
3. 위의 결과를 다시 100.0으로 나눈다. (double)

 */
public class MathClass {
    public static final double E = 2.72182818284590452354;
    public static final double PI = 3.14159265358979323846;
    /*
    abs(숫자) 절대값 반환
    int i = Math.abs(-10);   // i = 10
    double d = Math.abs(-10.0);   // d = 10.0

    ceil() 값을 올림
    double d  = Math.ceil(10.1);        // d = 11.0
    double d2 = Math.ceil(-10.1);       // d2 = -10.0 큰숫자로 올림
    double d3 = Math.ceil(10.000015);   // d3 = 11.0

    floor() 값을 버림한다.
    double d = Math.Floor(10.8);        // d = 10.0
    double d = Math.Floor(-10.8);       // d = -11.0

    max(double a, double b)  max(int a, int b)  max(long a, long b)  주어진 값중 큰 값 반환
    double d = Math.max(9.5, 9.50001);  // d = 9.50001
    int i = Math.max(5, 10);            // i = 10
    min(double a, double b) int long float   주어진 값중 작은 값을 반환
    double d = Math.min(9.5, 9.50001);  // d = 9.5
    int  i = Math.min(5, 10);           // i = 5

    random()  0.0~1.0 범위의 임의의 double값을 반환한다. 1.0은 범위에 포함되지 않는다.
    double d = math.random();           // 0.0 <= d < 1.0
    int i = (int)(Math.random()*10)+1;  // 1 <= 1 < 11
    rint(double a)    주어진 double값과 가장 가까운 정수값을 double형으로 반환한다. 두 정수의 정 가운데 있는값(1.5, 2.5)은 짝수를 반환
    double d  = Math.rint(1.2);         // d  = 1.0
    double d2 = Math.rint(2.6);         // d2 = 3.0
    double d3 = Math.rint(3.5);         // d3 = 4.0
    double d4 = Math.rint(4.5);         // d4 = 4.0

    round(double a) 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다.
    long l  = Math.round(1.2);          // l  = 1
    long l2 = Math.round(2.6);          // l2 = 3
    long l3 = Math.round(3.5);          // l3 = 4
    long l4 = Math.round(4.5);          // l4 = 5
    double d = 90.7552;                     // d = 90.7552
    double d2 = Math.round(d*100)/100.0;    // d = 90.76

     */
    public static void main(String[] args) {
        long l  = Math.round(1.2);          // l  = 1
        long l2 = Math.round(2.6);          // l2 = 3
        long l3 = Math.round(3.5);          // l3 = 4
        long l4 = Math.round(4.5);          // l4 = 5
//        int l5 = Math.round(4.5);          // l5 에러,
//        double d = 90.7552;                     // d = 90.7552
//        double d2 = Math.round(d*100)/100.0;    // d = 90.76
//        System.out.println(l);
//        System.out.println(l2);
//        System.out.println(l3);
//        System.out.println(l4);
//        System.out.println(d2);
        double d  = Math.rint(1.2);         // d  = 1.0
        double d2 = Math.rint(2.6);         // d2 = 3.0
        double d3 = Math.rint(3.5);         // d3 = 4.0
        double d4 = Math.rint(4.5);         // d4 = 4.0 반올림한 결과가 짝수가 되도록 하는 것, 그래서 4.0
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

    }

}
