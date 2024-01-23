package com.javastudy.exam.inputoutput.substream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);

        int readCharNo;
        char[] cbuf = new char[100]; // Reader를 쓰기에, byte 배열이 아닌 char배열로 읽어들인다..
        // 입력 종료하려면 ctrl+z 눌러서 read가 -1이 되도록 하라는데, intellij 에선 안된다.
        while ((readCharNo=reader.read(cbuf)) != -1) {
            String data = new String(cbuf, 0, readCharNo);
            if (data.equals("quo")) break; // 반복탈출 실패, 이게 엔터쳐서 받는거다보니깐, 개행문자도 하나의 문자로 치다보니깐 빈값으로 인식이 안되는 것 같다.
            if (data.startsWith("quit") && data.length()==5) break; // 반복탈출 성공
            if (data.endsWith("mon\n")) break; // 반복탈출 성공

            System.out.print(data.length()+" "); //
            System.out.print(data);
        }
        // 무한반복인데...

        reader.close();
        is.close();
    }
}
