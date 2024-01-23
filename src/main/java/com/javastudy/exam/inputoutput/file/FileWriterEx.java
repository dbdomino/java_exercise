package com.javastudy.exam.inputoutput.file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true); // append 시키는 소스
		fw.write("FileWriter는 한글로된 " + "\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}

