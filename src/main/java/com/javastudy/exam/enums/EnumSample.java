package com.javastudy.exam.enums;

import java.util.Arrays;

//               0       1     2      3
enum Direction { EAST, SOUTH, WEST, NORTH }
public class EnumSample {
    public static void main(String[] args) {
        Direction2 d1 = Direction2.EAST;  // 열거형타입.상수이름.
        Direction2 d2 = Direction2.valueOf("WEST");
        Direction2 d3 = Enum.valueOf(Direction2.class, "EAST");

        System.out.println(Direction2.values()); // enum 객체로 ArrayList 반환
        System.out.println(Arrays.toString(Direction2.values())); // string으로 바꿔서 반환

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);
        System.out.println("d3 ordinal="+d3.ordinal());

        System.out.println("d1==d2 ? "+ (d1==d2));
        System.out.println("d1==d3 ? "+ (d1==d3)); // 비교연산자 같음
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));  // equals 같음 -> enum에는 객체로 들어간다.
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러
        System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));  // EAST - EAST, 0 - 0 = 0
        System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));  // EAST - WEST, 0 - 2 = -2

        switch(d1) {
            case EAST: // Direction.EAST -> 같은소스에 선언되있다보니 이렇게 쓰기 가능.
                System.out.println("The direction is EAST."); break;
            case SOUTH:// Direction.SOUTH
                System.out.println("The direction is SOUTH."); break;
            case WEST: // Direction.WEST
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
//            case CardE.Kind.CLOVER:  // static 으로 선언된게 아니라 외부 enum은 사용 불가
            default:
                System.out.println("Invalid direction."); break;
        }

        Direction2[] dArr = Direction2.values();

        for(Direction2 d : dArr)  // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }

}
