package com.javastudy.exam.stream.stream_return;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFromFileContent {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/main/java/com/javastudy/exam/stream/stream_return/linedata.txt"); // 파일 없으면 에러남.
		Stream<String> stream;

		//Files.lines() 메소드 이용
//		stream = Files.lines(path, Charset.defaultCharset()); //Files.lines 를 통해 경로의 파일과 인코딩을 지정해 stream<String>으로 불러옴.
		stream = Files.lines(path, Charset.forName("UTF-8")); //Files.lines 를 통해 경로의 파일과 인코딩을 지정해 stream<String>으로 불러옴.
		// Charset.defaultCharset() 운영체제 기본 인코딩으로 사용한다는 소리
		stream.forEach( System.out :: println );  // 메소드 참조를 이용해서 s -> {System.out.println(s);} 를 변환한 것
		stream.close();
		System.out.println();

		//BufferedReader의 lines() 메소드 이용
		File file = path.toFile(); // 해당 path로 파일 객체를 얻어냄. java.io
		FileReader fileReader = new FileReader(file); // 파일을 읽는 FileReader(file), 문자 파일을 읽는 stream
		BufferedReader br = new BufferedReader(fileReader); // 읽기 성능을 향상하기 위해 BufferedReader 를 사용
		stream = br.lines(); // 버퍼를 통해 lines()호출 == Files.lines() 위의 문구와 같으며, stream을 반환
		stream.forEach( System.out :: println ); // 메소드 참조를 이용해서 s -> {System.out.println(s);} 를 변환한 것
		stream.close();
		br.close(); // 꼭 안써도되는듯
		fileReader.close(); // 꼭 안써도 되는듯
	}
}
