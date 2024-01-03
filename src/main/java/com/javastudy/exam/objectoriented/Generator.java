package com.javastudy.exam.objectoriented;
class Data_1 {
    int value;
    // Data_1 () {} // 생성자가 하나도 없어서, 컴파일러가 기본생성자를 생성해줌.
}

class Data_2 {
    int value;

    // Data_1 () {} // 아래 생성자가 하나있어서 컴파일러가 기본생성자를 생성안함.
    // 클래스 만들 때 기본생성자를 직접 구현해 주는 습관을 들이는게 좋다.
    Data_2(int x) {   // 매개변수가 있는 생성자.
        value = x;
    }
}

public class Generator {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
//        Data_2 d2 = new Data_2(); // compile error발생, 기본생성자 없어서
//        Data_2 d2 = new Data_2(); // compile error발생
    }
}
