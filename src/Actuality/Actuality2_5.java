package Actuality;

import java.util.Scanner;

public class Actuality2_5 {

	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b>=c || b+c>a || a+c>b){
			System.out.println("삼각형이 됩니다.");
		}
		else {
			System.out.println("삼각형이 안됩니다.");
		}
	}

}
