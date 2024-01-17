package com.javastudy.exam.enums;


class Card {
    static final int CLOVER = 0;
    static final int HEART = 1;
    static final int DIAMOND = 2;
    static final int SPADE = 3;
    static final int TWO = 0;
    static final int THREE = 1;
    static final int FOUR = 2;

    final int kind;
    final int num;

    Card() {this.kind = CLOVER;
        this.num = TWO;}

    Card(int kind, int num) {
        this.kind = kind;
        this.num = num;
    }
}
class CardE{
    enum Kind {CLOVER, HEART, DIAMOND, SPADE}   // 자동으로 값이 0 1 2 3 으로 매겨진다.
    enum Value {ZERO, ONE, TWO, THREE, FOUR}   // 자동으로 값이 0 1 2 3 4 로 매겨진다.
    enum Direction {EAST, SOUTH, WEST, NORTH}

    int dir;
    final Kind kind;
    final Value value;
    CardE() {
        this.kind = Kind.CLOVER;
        this.value = Value.THREE; // final에선 ordinal() 안써도됨.
        this.dir = Direction.WEST.ordinal(); // ordinal() 해당 name의 값을 출력.
    }
    CardE(Kind kind, Value value) {
        this.kind = kind;
        this.value = value;
        this.dir = Direction.EAST.ordinal(); // ordinal() 해당 name의 값을 출력.
    }

    void compar() {
//        if (dir == Direction.EAST) {  // 불가능,
        if (this.dir == Direction.EAST.ordinal()) { // 가능
            System.out.println("this.dir == Direction.EAST.ordinal()");
        } else if (dir > Direction.WEST.ordinal()) {
            System.out.println("dir > Direction.WEST.ordinal()");
//        } else if (dir.compareTo(Direction.WEST.ordinal()) > 0) { // final일 경우 compareTo 사용가능, 왼쪽 크면 양수, 같으면 0, 오른쪽 크면 음수
        } else if (value.compareTo(Value.THREE) > 0) {
            System.out.println("value.compareTo(Value.THREE) > 0");
        } else {
            System.out.println("value.compareTo(Value.THREE) > 0 false");
        }
    }


}
public class EnumCard {
    public static void main(String[] args) {
//        CardE e = new CardE(); //enum 형식이 들어있는건
//        if (CardE.Kind.HEART == CardE.Value.ONE) { // 장애, 컴파일에러, 타입이 달라서 비교 불가
        if (EnumCard.Value.THREE == EnumCard.Value.THREE ) { // enum은 선언해두면 static 아니어도 불러올수있나?
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }
    }
    enum Kind {CLOVER, HEART, DIAMOND, SPADE}   // 자동으로 값이 0 1 2 3 으로 매겨진다.
    enum Value {ZERO, ONE, TWO, THREE, FOUR}   // 자동으로 값이 0 1 2 3 4 로 매겨진다.

}
