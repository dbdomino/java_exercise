package com.javastudy.exam.inputoutput.substream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {
	public static void main(String[] args) throws Exception {
//		File file3 = new File(new URI("file:///C:/Temp/file3.txt")); // URI는 예외처리가 필요한 생성자
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt"); // FileOutputStream byte로 출력
		Writer writer = new OutputStreamWriter(fos); // OutputStreamWriter 보조 스트림

		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data); // 즉 문자열로 받아서 FileOutputStream에 byte로 쓴다. 파일에 바로 기록됨.

		writer.flush(); // 파일에 기록과 상관없이 버퍼를 초기화, 클라이언트에 전송 시에도 사용
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
	}
}

