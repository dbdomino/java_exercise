package com.javastudy.exam.stream.stream_final;

import java.util.ArrayList;
import java.util.List;

public class CustomCollect {
	// StudentEnum 객체만 저장하는 커스텀 컬랙터 객체
	private List<StudentEnum> list;
	
	public CustomCollect() {
		list = new ArrayList<StudentEnum>();
		System.out.println("[" + Thread.currentThread().getName() + "] CustomCollect()");
	}
	
	public void accumulate(StudentEnum student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] CustomCollect.accumulate() 집계");
	}
	
	public void combine(CustomCollect other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] CustomCollect.combine() 병렬처리 할때 씀");
	}
	
	public List<StudentEnum> getList() {
		return list;
	}
}
