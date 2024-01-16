package com.javastudy.exam.singleton;

public class SingletonSample {
    public static void main(String[] args) {
        /*
        싱글톤 패턴을 만들땐 기본적으로 생성자를 private로 해서 외부에서는 직접 인스턴스를 생성할 수 없게 하고,
        사용자에게 인스턴스를 전달하는 static 메소드가 있다. 아래 예제를 보자.
        아래 예제를 보면 객체는 오로지 getInstance()를 통해서만 생성되거나 얻을 수 있다.
        이로인해 예제 출력을 해도 1이 두번 출력된다.
         */
//        SingletonPatternEx s1 = new SingletonPatternEx(); // 에러, private로 생성자가 되어있어 선언불가
        SingletonPatternEx s1 = SingletonPatternEx.getInstance(); // 이런식으로 불러와야 함.
        SingletonPatternEx s2 = SingletonPatternEx.getInstance(3); // 이런식으로 불러와야 함.

        System.out.println(s1.getNumber()); // s1에 선언된 기본값 0이 출력되며
        System.out.println(s2.getNumber()); // s2에서 .getInstance(3) 이게 먹히지 않음.

    }
}
