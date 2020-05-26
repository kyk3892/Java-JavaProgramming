package Actuality;

import java.util.Scanner;

public class Actuality3_5 {

	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int i=0; i<num.length; i++) {
			if(num[i]%3==0) {
				System.out.print(num[i]+" ");
			}
			else {
				continue;
			}	
		}
			
	}

}
