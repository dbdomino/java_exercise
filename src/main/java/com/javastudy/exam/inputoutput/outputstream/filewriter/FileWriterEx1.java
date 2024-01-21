package com.javastudy.exam.inputoutput.outputstream.filewriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("src/main/java/com/javastudy/exam/inputOutput/outputstream/Atest01.txt");
		char[] data = "그림자분신ddc".toCharArray();
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]); // 문자 1개 단위로 넣어주기, 한글은 2byte 영문은 1byte단위로 쪼개서 넣어줌.
			System.out.println("i : "+i+", data[i] : "+data[i]);
		}
		writer.flush(); // 버퍼의 메모리 반환을위해 해주자.
		writer.close();
	}

}
