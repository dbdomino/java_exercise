package com.javastudy.exam.inputoutput.substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// BufferedOutputStream을 사용했을때와 사용하지 않았을 때 이미지를 읽어서 다른 경로에 쓰는 속도 비교
public class BufferedOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data = -1;
		long start = 0;
		long end = 0;
		String src= "src/main/java/com/javastudy/exam/inputoutput/substream";
		fis = new FileInputStream(src+"/image2.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/image2.png");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); 	bis.close();  fis.close();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");

		fis = new FileInputStream(src+"/image2.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/image2.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); 	bis.close(); fis.close();
		System.out.println("사용했을 때: " + (end-start) + "ms");
	}
}

