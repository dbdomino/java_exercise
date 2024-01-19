package com.javastudy.exam.lambdasic.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
		new Student("김마리", 90, 96),
		new Student("권용준", 95, 93)
	);
	
	public static void printString(Function<Student, String> function) { // Student로 받아 String으로 반환하는 Function 형식으로 매개변수를 받음. Function은 함수형 인터페이스
		for(Student student : list) { // 매개변수로 받은 function(Function 구현체)을 외부의 list를 가지고 studunt를 function(Function 구현체)에 넣어 String형식으로 반환한 것을 출력함.
			System.out.print(function.apply(student) + " "); // apply()는 function 함수형 인터페이스의 공통적인 실행메소드이며, 실제 수행은 구현부에 람다식으로 넣은 부분이 수행된다.
		}

		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) { // Student로 받아 int로 반환하는 ToIntFunction 형식으로 매개변수를 받음. ToIntFunction는 함수형 인터페이스
		for(Student student : list) { // 외부의 list를 가지고 student를 function(ToIntFunction 구현체)에 넣어 int 형식으로 반환한 것을 출력함.
			System.out.print(function.applyAsInt(student) + " "); // apply()는 ToIntFunction 함수형 인터페이스의 실행메소드이며, 실제 수행은 구현부에 람다식으로 넣은 부분이 수행된다.
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName() );  // Function 함수형 인터페이스를 람다식으로 구현한 것을 매개변수로 넣음.
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() ); // ToIntFunction 함수형 인터페이스를 람다식으로 구현한 것을 매개변수로 넣음.
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
	}
}
