package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum;
	private Random rnd;
	private Scanner scan;

	// 생성자 method (Class명과 똑같고 return type이 없다(ex/ public void, public String 등 )
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void pickup() {


		int intRnd = rnd.nextInt(10) + 1;
		int Num = 0;


		while (true) {
			++Num;
			System.out.print("숫자(1~10)입력,종료(END)>>");
			String strKey = scan.nextLine();
			if (strKey.equals("END"))
				break;

			int intKey = Integer.valueOf(strKey.trim());

			if (intKey == intRnd) {
				System.out.println(Num + "번 만에 맞추셨네요");
				intRnd = rnd.nextInt(10) + 1;
				Num = 0;
			} else {
				if (intKey > intRnd) {
					System.out.println("큰 수를 입력했군요");
				} else if (intKey < intRnd) {
					System.out.println("작은 수를 입력했군요");
				}
			}
		}
		System.out.println("끝");
	}

}
