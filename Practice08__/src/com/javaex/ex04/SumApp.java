package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// numLine을 split
		String[] data = numLine.split(" "); // 공백 문자를 기준으로 분할
		
		// 루프
		for (int i = 0; i < data.length; i++) {
			int num = Integer.parseInt(data[i]); // 문자열 -> int
			sum += num;
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
