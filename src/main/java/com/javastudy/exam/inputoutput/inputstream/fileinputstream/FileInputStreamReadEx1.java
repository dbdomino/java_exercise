package com.javastudy.exam.inputoutput.inputstream.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamReadEx1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("src/main/java/com/javastudy/exam/inputOutput/inputstream/Atest01.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.print((char)readByte); // 1바이트 짜리는 읽어진다 숫자, 영어, 개행, 그러나 한글은 깨진다.
		}
		is.close();
	}

}
