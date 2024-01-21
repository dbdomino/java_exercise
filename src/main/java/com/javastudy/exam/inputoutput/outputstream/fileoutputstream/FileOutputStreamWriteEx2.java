package com.javastudy.exam.inputoutput.outputstream.fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamWriteEx2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/main/java/com/javastudy/exam/inputOutput/outputstream/Atest01.txt");
		byte[] data = "ABC".getBytes();
		os.write(data); // data배열을 한번에 쓰기
		os.write(data);
		os.flush(); // write를 하면 메모리 버퍼에 데이터가 차기 시작하는데, 버퍼에 가득차지 않으면 데이터가 출력되지 않는다. 버퍼에 잔류하는 모든 바이트를 출력
		// outputStream이 FileOutputStream 이므로, flush() 없이도 파일에 바로바로 써지는게 가능하다.
		os.write(data);
		os.close();
	}

}
