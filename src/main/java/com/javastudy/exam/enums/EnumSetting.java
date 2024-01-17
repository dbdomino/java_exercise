package com.javastudy.exam.enums;

enum Direction2 {
    // 선언된 열거형마다, 콤마로 구분하며 생성자 선언해주고, 끝에 세미콜론 붙이기;
    EAST(1), SOUTH(5), WEST(-2), NORTH(9); // enum의 생성자가 있어야 이런식으로 값 주입 가능
    // 기존에 이런식으로 값을 안줬다면, 입력된 순서가 출력되었으나
    Direction2(int value) {this.value= value;} // 생성자 추가, enum 열거형의 생성자는 반드시 private이므로 생략 가능
    private final int value; // 정수를 저장할 필드(인스턴스 변수)를 추가, final 형식이라는게 중요

    public int getValue()     { return value;  }
}

enum Direction3 { // 상수이지만 값을 2개씩 가지는게 가능하다... 열거형으로 선언된
    EAST(10, ">"), SOUTH(20,"V"), WEST(30, "<"), NORTH(40,"^");

    private static final Direction3[] DIR_ARR = Direction3.values(); // 열거형의 값을을 배열에 담아두는건데, 컴파일러가 values()를 자동으로 추가해준다고 함.
    /* values()는 열거형 Direction3에 정의된 모든 상수를 배열로 반환

        Direction3[] dArr = Direction.values();
        for(Direction d : dArr)   // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
     */
    private final int value;
    private final String symbol;

    Direction3(int value, String symbol) { // 접근 제어자 private이 생략됨
        this.value  = value;
        this.symbol = symbol;
    }

    public int getValue()     { return value;  }
    public String getSymbol() { return symbol; }

    public static Direction3 of(int dir) {  // 상수의 값을 가져오는 메소드
        if (dir < 1 || dir > 4)  // 1부터 4까지 받음.
            throw new IllegalArgumentException("Invalid value :" + dir);

        return DIR_ARR[dir - 1];
    }

    // 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
    public Direction3 rotate(int num) {
        num = num % 4;
        if(num < 0) num +=4; // num이 음수일 때는 시계반대 방향으로 회전

        return DIR_ARR[(value-1+num) % 4];
    }

    public String toString() {
        return name()+getSymbol();
    }
} // enum Direction2
public class EnumSetting {
    public static void main(String[] args) {
        System.out.println(Direction2.NORTH);
        System.out.println(Direction2.NORTH.getValue()); //  값 출력, 직접만든
        System.out.println(Direction2.NORTH.ordinal());  //순서 출력, 기본제공

        for(Direction3 d : Direction3.values())
            System.out.printf("%s=%d%n", d.name(), d.getValue());

        Direction3 d1 = Direction3.EAST;
        Direction3 d2 = Direction3.of(2);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction3.EAST.rotate(1));
        System.out.println(Direction3.EAST.rotate(2));
        System.out.println(Direction3.EAST.rotate(3));
        System.out.println(Direction3.EAST.rotate(4));
        System.out.println(Direction3.EAST.rotate(-1));
        System.out.println(Direction3.EAST.rotate(-2));

    }

}
