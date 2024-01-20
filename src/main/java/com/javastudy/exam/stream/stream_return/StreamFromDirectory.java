package com.javastudy.exam.stream.stream_return;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFromDirectory {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C://a_project/java_exercise"); // 경로 틀리면 에러발생
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()) ); // stream은 한번 쓰면 다소모된다,

		Path path2 = Paths.get("C://a_project/java_exercise");
		Stream<Path> stream2 = Files.list(path2);
		stream2.forEach( p -> System.out.println(p.getFileName())); // get 치면 얻을 수 있는게 많다. 확인가능
	}
}
