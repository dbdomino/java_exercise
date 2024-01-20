package com.javastudy.exam.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
// Iterator와 Stream반복자 비교
public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("그림1", "화물2", "영양3");

		//Iterator 반복
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//Stream 반복
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name) );
	}
}
