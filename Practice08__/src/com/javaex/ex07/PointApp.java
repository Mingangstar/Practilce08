package com.javaex.ex07;

public class PointApp {


	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 10);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1.equals(p2));  // (2,3) (2,10) 은 같다
		System.out.println(p1==p2);         // (2,3) (2,3) 의 주소값은 다르다
		System.out.println(p1.equals(p3));  // (2,3) (5,3) 은 다르다
		System.out.println(p4.equals(p1));  // p1 과 p4는 같다
		
		
	}

}


