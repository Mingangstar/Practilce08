package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// to String() 을 작성 하세요
	@Override
	public String toString () {
		// 출력 문자열 형식 반환
		return String.format("[포인트] x=%d, y=d 입니다.%n", x, y);
	}
}