package com.javastudy.exam.object;

import java.util.Objects;

public class ExCard{
    public static void main(String[]args){
        Card c1 = new Card();
        Card c2 = new Card();
        System.out.println(c1.equals(c2)); // equals overriding 해줬으면
        System.out.println(c1.hashCode()); // hashcode()도 오버라이딩 해줘서 equals랑 결과 같도록 조정해줘야댐
        System.out.println(c2.hashCode());

    }
}
class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // object의 equals 메소드를 overriding해서 객체 주소를 비교하는게 아닌, 객체의 value값으 비교하도록 재구성
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) return false; // Card로 형변환 불가능하면 false 반환
        Card v = (Card) obj;// 다형성으로 형변환 지원
        return this.kind == v.kind && this.number == v.number;
    }
    // value의 값으로 hashcode출력하도록, equals도 값으로 비교하도록 수정했으니, HashCode도 값으로 HashCode화시킨걸 비교하기 위해
    public int hashCode() {
//        return Objects.hashCode(kind); //
        return Objects.hash(kind, number); // 매개변수가 가변인자라서(Object... 라는 가변인자로 호출시 지정하는 값의 개수가 정해져있지 않다.)
    }
    // toString일 경우 인스턴스 변수가 출력되도록 overriding
    public String toString() {
        return "kind:"+kind+", number:"+number;
    }
}
