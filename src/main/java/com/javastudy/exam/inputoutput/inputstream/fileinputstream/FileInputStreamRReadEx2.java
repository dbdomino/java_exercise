package com.javastudy.exam.inputoutput.inputstream.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamRReadEx2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("src/main/java/com/javastudy/exam/inputOutput/inputstream/Atest01.txt");
		int readByteNo;
//		byte[] readBytes = new byte[3];
		byte[] readBytes = new byte[8]; // 읽어들이는 byte 크기에 따라 read() 되는게 달라짐, 결과를 보장할 수 없음 이방식은
		String data = "";
//		while( true ) {
//			readByteNo = is.read(readBytes);
//			if(readByteNo == -1) break;
//			data += new String(readBytes, 0, readByteNo);
//		}
		while( (readByteNo = is.read(readBytes)) != -1 ) { // readBytes : read()로 읽은 데이터, 읽은 바이트수를 반환 ,더이상 읽을게 없으면 -1을 반환
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
