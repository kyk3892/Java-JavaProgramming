package Actuality;

import java.util.Scanner;

public class Actuality2_7 {

	public static void main(String[] args) {
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(100<=a && a<=200 && 100<=b && b<=200) {
			System.out.println("("+a+","+b+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else {
			System.out.println("("+a+","+b+")�� �簢�� �ȿ� �����ϴ�.");
		}

	}

}
