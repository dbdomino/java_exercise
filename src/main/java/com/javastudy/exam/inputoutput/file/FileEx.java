package com.javastudy.exam.inputoutput.file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
// File 클래스 예시
public class FileEx {
	public static void main(String[] args) throws Exception {
//		File dir = new File("C:/Temp/Dir");
//		File file1 = new File("C:/Temp/file1.txt");
//		File file2 = new File("C:/Temp/file2.txt");
//		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		String src= "src/main/java/com/javastudy/exam/inputoutput/file";
		File dir = new File(src);
		File file1 = new File(src+"/file1.txt");
		File file2 = new File(src+"/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt")); // URI는 예외처리가 필요한 생성자
//		File file3 = new File(new URI("file:///"+src+"/file3.txt")); // 이렇게는 경로 못찾아진다.

		if(dir.exists() == false) {  dir.mkdirs();  } // 없으면 새로만든다 폴더를
		if(file1.exists() == false) {  file1.createNewFile();  } // 없으면 새로만든다 파일을
		if(file2.exists() == false) {  file2.createNewFile();  }
		if(file3.exists() == false) {  file3.createNewFile();  }

		File temp = new File("C:/Temp"); // 폴더를 File 객체에 담아오는 것도 가능함.
		File[] contents = temp.listFiles(); // File객체 안에 있는 디렉토리와 파일들을 File객체로 만들어 배열로 넣음.
		System.out.println("날짜              시간         형태       크기    이름");
		System.out.println("-------------------------------------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm"); // date를 원하는 형태로 잡아주는 것
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));  // 파일의 마지막 수정일을 new Date()로 date객체로 만들어 sdf.format으로 날짜형식 출력 가능
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName()); // 폴더면 <DIR>
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 파일이면 파일 크기 file.length(), 파일명 file.getName()
			}
 			System.out.println();
		}
	}
}
