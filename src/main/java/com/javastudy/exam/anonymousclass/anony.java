package com.javastudy.exam.anonymousclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 익명클래스
// 이름이 없는 일회용 클래스, 정의와 생성을 동시에 한다.
// 이름이 없으니, 조상 클래스 이름을 쓰거나, 구현인터페이스 이름을 쓴다.
// 조상클래스 이름이나, 인터페이스 이름이 반드시 필요하다.
class anonyClass {
    Object iv = new Object(){ void method(){} };         // 익명 클래스
    static Object cv = new Object(){ void method(){} };  // 익명 클래스
//    Object iv2 = new (){ void method(){} };         //에러, 조상이름이나 상속시킬 인터페이스 이름을 하나 넣어줘야한다.
    anonyinterface iv3 = new anonyinterface(){
        public void method01(){ System.out.println("anonyClass iv3 interface on mothod01"); } //인터페이스 구현 메소드는 public,
    };

    void myMethod() {
        Object lv = new Object(){ void method(){} };      // 익명 클래스
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
public class anony {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurredddddd!!!");
            }
        });

        anonyClass a = new anonyClass();
        System.out.println("a.iv3 : "+a.iv3);
        System.out.println("a.iv3 : "+a.iv3);
        System.out.println("a.iv3 : "+a.iv3);
        a.iv3.method01(); // 성공, 인터페이스기준으로 구현한 일회용 클래스의 메소드
        a.iv3.method01(); // 성공, 한번만들고, 같은 클래스로 다른객체 생성하려면 또 클래스를 작성해야 한다는 소리다.
        a.iv3.method01(); //
    }
}
