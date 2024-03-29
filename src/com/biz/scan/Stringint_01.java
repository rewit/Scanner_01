package com.biz.scan;

public class Stringint_01 {

	public static void main(String[] args) {

		System.out.println(30+40); //70
		System.out.println("30+40"); // 30+40
		System.out.println("30" + "40"); //3040
		
		/*
		 *"30"과 "40"은 문자열형 숫자라고 하며
		 *숫자 30과 숫자40으로 변환시켜서
		 *4칙연산을 수행 할 수도 있다.
		 */
		System.out.println("30"+"40");
		//문자열을 정수로 변환하여 덧셈을 수행
		System.out.println(Integer.valueOf("30") + Integer.valueOf("40"));
		//정수를 문자열로 변환하여 연결을 수행
		System.out.println(Integer.toString(30) + Integer.toString(40) );

		System.out.println(Float.valueOf("30.0f"));
		

		System.out.println(Integer.valueOf("30"));
		// 30문자열 뒤에 white space가 있어서
		// 숫자(정수)로 변환 할 수 없다.
		// NumberFormat Exception
		// Integer에서는 문자든 숫자든 오면 에러
	}

}
