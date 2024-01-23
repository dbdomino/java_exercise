package com.javastudy.exam.inputoutput.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) throws Exception {
		String src= "src/main/java/com/javastudy/exam/inputoutput/file";
		String originalFileName = src+"/image1.jpg";  // 원본 이미지
		String targetFileName = "C:/Temp/house.jpg"; // 저장시킬 경로 + 이미지이름 + 확장자
		
		FileInputStream fis = new FileInputStream(originalFileName); // FileInputStream 매개값으로  FileInputStream에 파일경로/이름 을 넣어준다.
		FileOutputStream fos = new FileOutputStream(targetFileName); // FileOutputStream 매개값으로  FileOutputStream에 파일경로/이름 을 넣어준다.
		
		int readByteNo; // 읽은 바이트 수 저장할 변수
		byte[] readBytes = new byte[100]; // 읽을 바이트 배열
		while( (readByteNo = fis.read(readBytes)) != -1 ) {  // FileInputStream로 파일경로의 파일을 읽어
			// readBytes에 읽은 바이트를 저장하고, 읽은 바이트수를 readByteNo에 저장
			// 읽은 데이터는 FileOutputStream.write 으로 출력시킴, 적은 경로로 출력한다.
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("사진 복사 완료");
	}
}

