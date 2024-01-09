package com.javastudy.exam.stream;

import java.io.*;

public class bufferReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = br.read(); // 2045 입력시 50만 나온다,
//        System.out.println(a);
        String b = br.readLine(); // 2045 입력시 2045 나온다.
        System.out.println(b);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        String s = "abcdefg";   //출력할 문자열
        bw.write(s+"\n");   // bw에 값 쓰기
        bw.write("김치다."+"\n");   // bw에 값 쓰기
        bw.flush();   // bw 출력시킴
        bw.close();   //스트림을 닫음
    }
}
