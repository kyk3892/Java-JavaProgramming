package Actuality;

import java.util.Scanner;

public class Actuality3_3 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하시요>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=1; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
