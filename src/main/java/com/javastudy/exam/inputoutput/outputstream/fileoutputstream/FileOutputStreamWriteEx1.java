package com.javastudy.exam.inputoutput.outputstream.fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamWriteEx1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/main/java/com/javastudy/exam/inputOutput/outputstream/Atest01.txt");
		// ABC의 Bytes를 얻어옴.
		byte[] data = "ABCDE".getBytes();
//		os.write(data[2]); // outputStream에 문자 하나씩 쓰는 것.
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); // outputStream에 문자 하나씩 쓰는 것. -> 파일에 직접 하나씩 쓰는 것을 의미함.
			System.out.println("data : "+data[i]);
		}
		os.flush(); // buffer에 빈공간이 남아있으면 출력이 알아서 안되므로, 자동으로 출력시키기 위해 flush()를 실행
		// flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
		// outputStream이 FileOutputStream 이므로, flush() 없이도 파일에 바로바로 써지는게 가능하다.
		os.close();
	}

}
