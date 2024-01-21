package com.javastudy.exam.inputoutput.inputstream.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx03 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/main/java/com/javastudy/exam/inputOutput/inputstream/Atest01.txt");
//        int readData;
        int readCharNo;
        char[] cbuf = new char[4];

        readCharNo = reader.read(cbuf, 0, 2); // 하이   먼가 줄바꿈 문자를 읽다가 빠져버린다.
//        readCharNo = reader.read(cbuf, 0, 4); // 하이
        for(int i = 0; i < cbuf.length ; i++){
            System.out.print(cbuf[i]);
        }

        System.out.println(readCharNo);

        reader.close();
    }
}
