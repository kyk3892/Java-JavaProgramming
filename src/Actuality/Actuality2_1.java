package Actuality;

import java.util.Scanner;

public class Actuality2_1 {

	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		double dollar = (double)money/1100;
		System.out.println(money+"원은 $"+dollar+"입니다.");
	}

}
