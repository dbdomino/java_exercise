package com.javastudy.exam.inputoutput.inputstream.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx02 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/main/java/com/javastudy/exam/inputOutput/inputstream/Atest01.txt");
//        int readData;
        int readCharNo;
        char[] cbuf = new char[2];
        String str = "";  // 전체 문자열을 저장하기 위해
        StringBuilder sb = new StringBuilder();


//        while ( (readCharNo = reader.read(cbuf)) != -1) { // readCharNo -> 읽은 문자수를 저장,  cbuf -> 읽은 문자를 저장
////            System.out.println(readCharNo); // 여긴 읽은 문자수
////            System.out.print(cbuf); // 여긴 문자
//            str += new String(cbuf, 0 , readCharNo); // str에 문자를 계속 넣기
//            sb.append(cbuf);
//        }


        while ( true ) {
//            System.out.println(readCharNo); // 여긴 읽은 문자수
//            System.out.print(cbuf); // 여긴 문자
            readCharNo = reader.read(cbuf); // readCharNo -> 읽은 문자수를 저장,  cbuf -> 읽은 문자를 저장
            if (readCharNo != -1) break;  // 이렇게 해도 됨

            str += new String(cbuf, 0 , readCharNo); // str에 문자를 계속 넣기
            sb.append(cbuf);
        }

        System.out.println(str);
        System.out.println("-----");
        System.out.println(sb.toString());

        reader.close();
    }
}
