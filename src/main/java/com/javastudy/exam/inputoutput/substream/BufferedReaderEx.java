package com.javastudy.exam.inputoutput.substream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); // 보조스트림 바이트기반 -> 문자기반 으로 받기
		BufferedReader br = new BufferedReader(reader); // 성능 보조스트림 버퍼 리더

		System.out.print("입력: ");
		String lineString = br.readLine(); // readLine()으로 한번에 문자 출력 하는게 핵심, readLine()은 예외처리 해줘야함.

		System.out.println("출력: " + lineString);

		br.close();
		reader.close();
		is.close(); // 프로세스 종료되면 알아서 종료되긴함.
	}
}