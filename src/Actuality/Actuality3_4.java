package Actuality;

import java.util.Scanner;

public class Actuality3_4 {

	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		String alph = sc.next();
		char alphbet = alph.charAt(0);
		for(char i=alphbet; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
