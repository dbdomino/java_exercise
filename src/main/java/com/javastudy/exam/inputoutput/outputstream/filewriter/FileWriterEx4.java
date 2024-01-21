package com.javastudy.exam.inputoutput.outputstream.filewriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("src/main/java/com/javastudy/exam/inputOutput/outputstream/Atest01.txt");
		char[] data = "그림자 분신 ddc".toCharArray();

//		writer.write(data); // 한번에 입력되버림,
		// 그림자 분신 ddc
		// 0 1 2 3 4 5 6 7 8 9    -> 3 자리랑 6자리는 띄워쓰기다
		writer.write(data, 3, 2); //  띄워쓰기랑 분 이 파일에 입력된다.
		writer.flush(); // 버퍼의 메모리 반환을위해 해주자.
		writer.close();
	}

}
