package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum;
	private Random rnd;
	private Scanner scan;
	private int intRnd;
	private int intCount;
	private int intKey;
	private int count;

	public void resetCount() {
		int count = 0;
	}

	public int getCount() {
		return count;
	}

	public NumPick_04() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
		count = 0;
	}

	public void makeRandom() {

		intRnd = rnd.nextInt(10) + 1;
	}

	public boolean keyInput() {

		System.out.print("숫자(1~10)입력,종료(END)>>");
		String strKey = scan.nextLine();

		++count;

		if (strKey.equalsIgnoreCase("END")) {
			return true;
		}
		intKey = Integer.valueOf(strKey);
		return false;
	}

	public int pickup() {

		int ret = intKey - intRnd;
		if (ret == 0) {
			intRnd = rnd.nextInt(10) + 1;
			// count = 0;
		}

		return ret;
//		++count;
//
//		if (intKey == intRnd) {
//			System.out.println(count + "번 만에 맞추셨네요");
//			intRnd = rnd.nextInt(10) + 1;
//			count = 0;
//		} else {
//			if (intKey > intRnd) {
//				System.out.println("큰 수를 입력했군요");
//			} else if (intKey < intRnd) {
//				System.out.println("작은 수를 입력했군요");
//			}
//
//		}

	}

}
