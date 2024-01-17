package com.javastudy.exam.generics;

//제네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다.(경고 발생)
public class GenericTransform {
    public static void main(String[] args) {
        Box b = null;
        Box<Object> objBox = null;

        // 아래 둘다 가능은 하나 경고뜸, unchecked cast
        b = (Box)objBox;          // OK, 제네릭 타입 -> 원시타입
        objBox = (Box<Object>)b;  // OK, 원시타입 -> 제네릭 타입

        // 언제 가능할까?
        Box box = new Box<String>();
        box.add(100); // new Box<String>() 로 인스턴스 만들었지만 box의 참조변수가 원시타입이라서 100이 들어가진다.
        System.out.println(box); // 출력도 가능

        Box<String> box2 = new Box();
//        box2.add(100); // 위의 오류를 방지하기 위해. 참조변수 측에 제네릭으로 <String> 처럼 선언을 해주는게 좋다.
//        System.out.println(box2); // 출력 불가
//        objBox = (Box<Object>)b;  // 에러, Box<String> -> Box<Object>는 변환 안됨, 서로 다른 제네릭 타입끼리는 형변환이 안됨.
//        box = (Box<String>)objBox;  // 에러, Box<Object> -> Box<String>은 변환 안됨.
//         Box<String> d = new Box<Object>(); //안됨
//         Box<String> e = (Box<String>)new Box<Object>(); //형변환 해도 안됨

        // - 와일드 카드가 사용된 제네릭 타입으로는 형변환 가능
//        Box<? extends Object> wBox = (Box<? extends Object>)new Box<String>();  // 가능
        Box<? extends String> wBox = (Box<? extends String>)new Box<String>();  // 형변환은 가능, 그러나 wBox에 add하는건 별개임.
        Box<? extends Object> wBox2 = new Box<String>();
        System.out.println("wBox");
//        wBox.add("개체1");  // 와일드카드 리스트로 만들어져서 unknown타입 리스트가 만들어졋는데, unknown 타입의 자식이여야 들어갈 수 있는데,
//        // 이때문에 정해진 것이 들어가는게 안된다.
//        wBox.add(2);
//        wBox.add(objBox);
        System.out.println(wBox);
    }
}
