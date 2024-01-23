package com.javastudy.exam.inputoutput.substream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		PrintStream ps = new PrintStream(fos);

		ps.println("[프린터 보조 스트림]"); // print로 선언된게 파일에 들어간다., PrintStream으로 넣는 것이다.
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");

		ps.flush();
		ps.close();
		fos.close();
	}
}
