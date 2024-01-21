package com.javastudy.exam.inputoutput.outputstream.filewriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("src/main/java/com/javastudy/exam/inputOutput/outputstream/Atest01.txt");
		char[] data = "그림자분신ddc".toCharArray();

		writer.write(data); // 한번에 입력되버림, 
		writer.flush(); // 버퍼의 메모리 반환을위해 해주자.
		writer.close();
	}

}
