package Actuality;

import java.util.Scanner;

public class Actuality2_6 {

	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int share = num/10;
		int rest = num%10;
		
		if(share==3 || share==6 || share==9){
			if(rest==3 || rest==6 || rest==9) {
				System.out.println("�ڼ�¦¦");
			}
			else {
				System.out.println("�ڼ�¦");
			}
		}
		else if(rest==3 || rest==6 || rest==9){
			System.out.println("�ڼ�¦");
		}
		else {
			System.out.println();
		}
	}

}
