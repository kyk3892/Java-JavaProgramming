package Actuality;

import java.util.Scanner;

public class Actuality2_3 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int fiveman = (int)money/50000;
		int man = (int)money%50000/10000;
		int thousand = (int)money%10000/1000;
		int fivehd = (int)money%1000/500;
		int onehd = (int)money%500/100;
		int fitten = (int)money%100/50;
		int ten = (int)money%50/10;
		int one = (int)money%10/1;
		
		System.out.println("오만원권 "+fiveman+"매");
		System.out.println("만원권 "+man+"매");
		System.out.println("천원권 "+thousand+"매");
		System.out.println("오백원 "+fivehd+"매");
		System.out.println("백원 "+onehd+"매");
		System.out.println("오십원 "+fitten+"매");
		System.out.println("십원 "+ten+"매");
		System.out.println("일원 "+one+"매");

	}

}
