package com.javastudy.exam.inputoutput.inputstream.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamRReadEx3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("src/main/java/com/javastudy/exam/inputOutput/inputstream/Atest01.txt");
		int readByteNo;
		byte[] readBytes = new byte[9];
		// read(byte[], off, len), off는 시작 인덱스, len은 읽어들일 길이, 특정 위치만큼만 읽어들이겠다는 소리
		readByteNo = is.read(readBytes, 2, 5); // len에 따라서  java.lang.IndexOutOfBoundsException 발생
		System.out.println(readByteNo);
		for(int i=0; i<readBytes.length; i++) {
			System.out.print(readBytes[i]);
		}
		is.close();
	}

}
