package com.javastudy.exam.inputoutput.substream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
// 버퍼를 사용했을 때, 사용하지 않았을 때 소요되는 시간을 비교하는 소스
public class BufferedInputStreamEx {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		String src= "src/main/java/com/javastudy/exam/inputoutput/substream";
		FileInputStream fis1 = new FileInputStream(src + "/image2.png");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();

		FileInputStream fis2 = new FileInputStream(src + "/image2.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

