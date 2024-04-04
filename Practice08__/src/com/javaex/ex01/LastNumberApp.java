package com.javaex.ex01;

public class LastNumberApp {

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}


	//런타임시 오류발생
	public static void lastValue() {

		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result;
		
		
		try {
		//아래부분을 try~catch문을 사용하여 수정하세요
		result = intArray[3];
		System.out.println(result);
			} catch (ArrayIndexOutOfBoundsException e) {
				// 구체적 예외 처리를 앞쪽에서
				System.err.println("배욜의 범위를 넘었습니다");
			} catch (Exception e) {
				// 일반적인 예외는 뒤쪽에서
				e.printStackTrace();
			}
		
	}
  
}
