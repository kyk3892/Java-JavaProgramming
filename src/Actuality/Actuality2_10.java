package Actuality;

import java.util.Scanner;

public class Actuality2_10 {

	public static void main(String[] args) {
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r2 = sc.nextDouble();
		double twodot = Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)));
		
		if(twodot<=r+r2) {
			System.out.println("두 원은 서로 겹친다.");
		}
		else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}

	}

}
