package Actuality;

import java.util.Scanner;

public class Actuality2_10 {

	public static void main(String[] args) {
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r2 = sc.nextDouble();
		double twodot = Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)));
		
		if(twodot<=r+r2) {
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}

	}

}
