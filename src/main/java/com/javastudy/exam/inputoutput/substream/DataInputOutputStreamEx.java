package com.javastudy.exam.inputoutput.substream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat"); // 기본 타입 데이터 저장을 위해 .dat 로 저장
		DataOutputStream dos = new DataOutputStream(fos); // 기본형 출력 보조 스트림

		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush(); dos.close(); fos.close();
		// primitive.dat 에는 데이터가 저장된 것을 보면 알 수 없는 형식으로 저장 된 것이 확인된다.

		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat"); // 해당 파일 읽어옴.
		DataInputStream dis = new DataInputStream(fis); // 기본형 입력 스트림,

		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}

		dis.close(); fis.close();
	}
}

