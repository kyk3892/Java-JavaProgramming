package Actuality;

import java.util.Scanner;

public class Actuality2_7 {

	public static void main(String[] args) {
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(100<=a && a<=200 && 100<=b && b<=200) {
			System.out.println("("+a+","+b+")는 사각형 안에 있습니다.");
		}
		else {
			System.out.println("("+a+","+b+")는 사각형 안에 없습니다.");
		}

	}

}
