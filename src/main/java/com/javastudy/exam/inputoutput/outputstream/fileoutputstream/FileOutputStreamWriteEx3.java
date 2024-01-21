package com.javastudy.exam.inputoutput.outputstream.fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamWriteEx3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/main/java/com/javastudy/exam/inputOutput/outputstream/Atest01.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2);// 1 index부터 2개만 출력, BC가 들어간다.
		os.flush();
		os.close();
	}

}
