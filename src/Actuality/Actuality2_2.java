package Actuality;

import java.util.Scanner;

public class Actuality2_2 {

	public static void main(String[] args) {
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int share = num/10;
		int rest = num%10;
		
		if(share==rest) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 같지않습니다.");
		}
	}

}
