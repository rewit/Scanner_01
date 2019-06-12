package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_06 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고 키보드로부터 1부터 10까지 숫자를 입력받아서 난수를 맞추는 게임 작성하시오
		 * 
		 * 단, 임의로 종료를 선택할때까지 계속해서 새로운 난수를 만들고 게임을 계속 할 수 있도록 하시오
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		Scanner scan = new Scanner(System.in);
		int Num = 0;
		// 몇번만에 숫자를 맞추었는지 알아보고
		// 숫자를 맞추면
		// * 번만에 맞추었네요 라고 메시지를 보여주기
		System.out.print("숫자(1~10)입력,종료(END)>>");
		while (true) {
			++Num;

			String strKey = scan.nextLine();
			if (strKey.equals("END"))
				break;

			int intKey = Integer.valueOf(strKey.trim());
			// 1번 코드
			// 1.보통은 중요한 코드(정답확인)을 위쪽에 두는 것이 좋지만
			// 다음처럼 코드를 작성해도 큰 문제는 없다
			// 다만, 이 코드는 정답을 맞추었더라도
			// 정답이 아닌 경우를 먼저 검사 한 후
			// 정답을 다시 검사하는 코드 중복실행이 발생 할 수 있다.

			if (intKey > intRnd) {
				System.out.println("큰 수를 입력했군요");
			}
			if (intKey < intRnd) {
				System.out.println("작은 수를 입력했군요");
			} else if (intKey == intRnd) {
				System.out.println(Num + "번 만에 맞추셨네요");
				intRnd = rnd.nextInt(10) + 1;
				Num = 0;
			}
		}

		System.out.println("끝");

	}

}
