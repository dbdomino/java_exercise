package com.javastudy.exam.abstracts;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {  System.out.println(pos + "위치부터 play"); }
    void stop() {  System.out.println("위치부터 stop"); }
}
public class AbstractTest {
    public static void main(String[] args) {
//        Player p = new Player(); // 에러, 추상클래스는 인스턴스 생성 불가능함.
        AudioPlayer ap = new AudioPlayer(); // 성공, 추상메소드 구현되어서 인스턴스 생성 가능

        Player p2 = new AudioPlayer(); // 다형성으로 부모 참조변수 형태로 자식 인스턴스 생성 및 참조 가능;
        ap.play(204);
        ap.stop();


    }
}
