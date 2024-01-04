package com.javastudy.exam.inheritance;

// 자바는 단일상속만을 허용한다, 2중상속해서 만들기 보단, 비중이 높은 클래스만 상속, 나머진 포함관계로 작성한다.
class Metal {
    boolean power; // 전원상태(on/off)
    int channel;	// 채널

}
class SmartMetal extends Metal {  // Metal은 상속, Stons은 포함 시켜서 두개의 클래스 정보를 활용 가능
    Stone s = new Stone(); //
    boolean caption;     // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}
class Stone {
    String name;
    int no;
}
public class SingleInheritance {
    public static void main(String args[]) {
        SmartMetal smetal = new SmartMetal();
        smetal.channel = 10;            // 조상 클래스로부터 상속받은 멤버
        smetal.s.name = "오리하르";         // 포함된 클래스로부터 받은 변수
        smetal.caption = true;
        smetal.displayCaption("smetal Hello, Worldvvv");
    }
}
