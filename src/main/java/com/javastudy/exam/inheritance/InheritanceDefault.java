package com.javastudy.exam.inheritance;

class Tv {
    boolean power; // 전원상태(on/off)
    int channel;	// 채널

    void power()       {   power = !power; }
    void channelUp()   {   ++channel;      }
    void channelDown() {   --channel;      }
}
// Tv 클래스 상속 (상속은 기존의 클래스로 새로운 클래스를 작성하는 것, 코드의 재사용.)
// 두 클래스를 부모와 자식으로 관계를 맺음, 자식의 변경은 부모에게 영향을 미치지 않는다.
// 상속은 클래스 하나만 가능. 제약이 많으므로 필요하거나 유리할때만 사용.
class SmartTv extends Tv {  // Caption 캡션(자막)을 보여주는 기능을 추가
    boolean caption;     // 캡션상태(on/off)
    void displayCaption(String text) {
        if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}
// Tv -> SmartTv -> SmartMonitor 관계로 상속
class SmartMonitor extends SmartTv {  //
    String pixel;
}
// Tv 클래스 포함 (포함은 클래스의 멤버로 참조변수를 선언하는 것)
// 포함은 클래스의 객체를 가지고 있다.
class PackageTv {
    Tv t= new Tv();
    String color;
    int code;
}

public class InheritanceDefault {
    public static void main(String args[]) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
        stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("stv Hello, World ooo"); // caption false라서 출력안됨
        stv.caption = true;	// 캡션(자막) 기능을 켠다.
        stv.displayCaption("stv Hello, Worldvvv");

        SmartMonitor sm = new SmartMonitor();
        sm.channel = 20;			// 조상 클래스로부터 상속받은 멤버
        sm.channelUp();			    // 조상 클래스로부터 상속받은 멤버
        System.out.println(sm.channel);
        sm.displayCaption("sm Hello, World 111");
        sm.caption = true;	// 조상 클래스로부터 상속받은 멤버
        sm.displayCaption("sm Hello, World 222");
        sm.pixel = "1920*1080";
        sm.displayCaption("sm pixel: " + sm.pixel);

        PackageTv ptv = new PackageTv();
        System.out.println("ptv.t.channel " + ptv.t.channel); // 자동 초기화 되면서 기본값 0
        ptv.t.channel = 30;// 포함된 클래스의 변수
        System.out.println("ptv.t.channel " + ptv.t.channel); // 클래스에 포함된 인스턴스의 기본변수 변경 확인
        ptv.color = "green";
        ptv.code = 37;
    }
}
