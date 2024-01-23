package com.javastudy.exam.inputoutput.file;

import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		String src= "src/main/java/com/javastudy/exam/inputoutput/file";
		FileReader fr = new FileReader(src+"/FileReaderEx.java"); // 파일 없으면 java.io.FileNotFoundException: src\main\java\com\javastudy\exam\inputoutput\file\FileReaderExample.java (지정된 파일을 찾을 수 없습니다)
		
		int readCharNo; // 읽은 문자 수 저장
		char[] cbuf = new char[100];  // 읽은 문자를 저장하는 char 배열
		while ((readCharNo=fr.read(cbuf)) != -1) { // 문자를 fr로 read()시켜 cbuf에 저장하며 readCharNo에 읽은 개수를 저장한다.
			String data = new String(cbuf, 0, readCharNo); // 문자열로 읽은 수만큼만 변환시킴
			System.out.print(data); // FileInputStream처럼 byte로 읽는게 아니라, 문자로 읽어들이므로 print로 출력 가능
//			System.out.write(data); // 에러
		}
		fr.close();
	}
}

