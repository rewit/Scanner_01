package com.biz.scan;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//두개의 숫자를 입력받아서 4칙 련산을 수행한다.
		
		int num1 =0;
		int num2 =0;
		
		/*
		 * 키보드에서는 문자열 데이터로 숫자를 입력받고
		 * 실제 정수로 변환하는 작업을 해주는 것이 좋다.
		 */
		System.out.print("숫자1>");
		String strKey1 = scan.nextLine();
		
		num1 = Integer.valueOf(strKey1); //값을 Integer형으로
		num1= Integer.parseInt(strKey1); //값을 int형으로       같긴 하나 parseInt보다는 valueOf형을 권장 
		//둘 다 문자형을 숫자형으로 바꾸는 방법
		
		Float.parseFloat(strKey1);
		Float.valueOf(strKey1);
		//parseInt는 Float로 바꿀 시 다시 Float형으로 사용해야함 
		
		
		System.out.print("숫자2>");
		String strKey2 = scan.nextLine();
		
		num2 = Integer.valueOf(strKey2);
		
		System.out.printf("%d + %d = %d" , num1, num2, num1+num2);
		
		
		
	}

}
