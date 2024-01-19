package com.javastudy.exam.lambdasic;

public class Student {
	private String name;
	private int score;
	
	public Student () {this.name = "기본1";
		this.score = 70;}
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }
}
