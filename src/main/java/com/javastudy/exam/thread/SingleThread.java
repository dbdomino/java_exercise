package com.javastudy.exam.thread;

public class SingleThread {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();

        for(int i=0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("작업1 소요시간:" +(System.currentTimeMillis()- startTime));

        for(int i=0; i < 300; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("작업2 소요시간:"+(System.currentTimeMillis() - startTime));
    }
}
