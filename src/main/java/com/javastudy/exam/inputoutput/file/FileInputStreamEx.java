package com.javastudy.exam.inputoutput.file;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		try {
			String src= "src/main/java/com/javastudy/exam/inputoutput/file";
			FileInputStream fis = new FileInputStream(src+"/FileInputStreamEx.java"); // 여기 자바소스를 FileInputStream으로 읽음.
			int data;
			while ( (data = fis.read() ) != -1 ) {
//				System.out.println(data); // print로 하는것과 write로 하는것의 결과가 다르다.
				System.out.write(data); // 파일로 FileInputStream으로 byte단위로 읽었기에, 출력시키려면
				// System.out 도 outputStream의 일환이므로 write를 사용할 수 있으며, System.out.write를 써서 출력하면 콘솔에 출력된다.
			}
			System.out.flush(); // 버퍼 초기화를 위해 flush()를 선언해주자.
			fis.close();	
		} catch(Exception e) { // FileInputStream, fis.read() 때문에 예외 처리를 함.
			e.printStackTrace();
		}
	}
}

