package Actuality;

import java.util.Scanner;

public class Actuality2_2 {

	public static void main(String[] args) {
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int share = num/10;
		int rest = num%10;
		
		if(share==rest) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
		}
	}

}
