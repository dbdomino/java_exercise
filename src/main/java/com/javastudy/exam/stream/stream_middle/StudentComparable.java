package com.javastudy.exam.stream.stream_middle;

public class StudentComparable implements Comparable<StudentComparable>{
	private String name;
	private int score;

	public StudentComparable(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }

	@Override
	public int compareTo(StudentComparable o) {
		// 이런식으로 비교조건 구현해도되지만
//		if(score<o.score) return -1;
//		else if (score == o.score) return 0;
//		else return 1;
		// Integer.compare 메소드로 결과 비교해도 된다.
		return Integer.compare(score, o.score);
	}
}
