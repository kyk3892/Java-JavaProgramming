package Actuality;

import java.util.Scanner;

public class Actuality3_6 {

	public static void main(String[] args) {
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		for(int i=0; i<unit.length; i++) {
			int mon = money/unit[i];
			if(mon!=0) {
				System.out.println(unit[i]+"원 짜리 : "+mon+"개");
			}
			money -= unit[i]*mon;	
		}
		
	}

}
