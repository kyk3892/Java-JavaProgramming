package Practice;

import java.util.Scanner;

public class Practice3_5 {

	public static void main(String[] args) {
		System.out.println("정수를 5개 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num,sum=0;
		for(int i=0; i<5; i++) {
			num = sc.nextInt();
			if(num<=0) {
				continue;
			}
			else {
				sum += num;
			}
		}
		System.out.println("양수의 합은 "+sum);

	}

}
