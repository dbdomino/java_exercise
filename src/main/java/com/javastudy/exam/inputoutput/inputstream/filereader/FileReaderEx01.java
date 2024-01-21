package com.javastudy.exam.inputoutput.inputstream.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx01 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/main/java/com/javastudy/exam/inputOutput/inputstream/Atest01.txt");
        int readData;
        while ( (readData = reader.read()) != -1) {
//            System.out.println(readData); // 여긴 바이트정보
            System.out.print((char)readData); // 여긴 문자
        }

        reader.close();


    }
}
