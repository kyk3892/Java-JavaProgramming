package Actuality;

import java.util.Scanner;

public class Actuality2_6 {

	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int share = num/10;
		int rest = num%10;
		
		if(share==3 || share==6 || share==9){
			if(rest==3 || rest==6 || rest==9) {
				System.out.println("박수짝짝");
			}
			else {
				System.out.println("박수짝");
			}
		}
		else if(rest==3 || rest==6 || rest==9){
			System.out.println("박수짝");
		}
		else {
			System.out.println();
		}
	}

}
