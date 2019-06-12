package com.biz.scan;

public class String_02 {

	public static void main(String[] args) {

		String strNum = "30 ";
		
		//trim()
		//문자열의 앞,뒤에 있는 white space 일부를 제거해주는 method
		//white space : sp(스페이스바),tap(\t), CR
		int intNum = Integer.valueOf(strNum.trim());
		//Java 11에서는 strip() 메서드를 새롭게 사용할 수 있는데
		//이 메서드는 유니코드,UTF-8에 지정되어 있는 
		//약 12가지의 whitespace를 모두 제거 할 수 있다.
		
	}

}
