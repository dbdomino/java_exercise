package com.javastudy.exam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// 스레드의 병렬처리 예시
public class ParallelExample {	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("배1", "배2", "배3", "배4", "배5", "배6", "배7", "배8", "배9", "배10");

		//순차 처리, 단일 스레드
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		
		System.out.println();

		//병렬 처리, 메인과 멀티스레드, 순서보장x
		Stream<String> parallelStream = list.parallelStream(); // 스레드가 몇개나 생길지 확실히 알지못함.
		System.out.println("hhoh start");
		parallelStream.forEach(ParallelExample :: print);
		System.out.println("hhoh end");
	}
	
	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}	
}
