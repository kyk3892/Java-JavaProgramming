package Actuality;

import java.util.Scanner;

public class Actuality2_9 {

	public static void main(String[] args) {
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		Scanner sc = new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double r=sc.nextDouble();
		System.out.print("�� �Է�>>");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if(Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)))<=r){
			System.out.println("�� ("+a+", "+b+")�� �� �ȿ� �ִ�.");
		}
		else {
			System.out.println("�� ("+a+", "+b+")�� �� �ȿ� ����.");
		}
	}

}
