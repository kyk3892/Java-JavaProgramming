package Actuality;

import java.util.Scanner;

public class Actuality2_9 {

	public static void main(String[] args) {
		System.out.print("원의 중심과 반지름 입력>>");
		Scanner sc = new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double r=sc.nextDouble();
		System.out.print("점 입력>>");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		if(Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)))<=r){
			System.out.println("점 ("+a+", "+b+")는 원 안에 있다.");
		}
		else {
			System.out.println("점 ("+a+", "+b+")는 원 안에 없다.");
		}
	}

}
