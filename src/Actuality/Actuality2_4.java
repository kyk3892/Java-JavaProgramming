package Actuality;

import java.util.Scanner;

public class Actuality2_4 {

	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int middle=0;
		if(num>=num2 && num>=num3) {
			if(num2>=num3) {
				middle=num2;
			}
			else if(num2<=num3){
				middle=num3;
			}
		}
		else if(num2>=num && num2>=num3) {
			if(num>=num3) {
				middle=num;
			}
			else if(num<=num3) {
				middle=num3;
			}
		}
		else if(num3>=num && num3>=num2) {
			if(num>=num2) {
				middle=num;
			}
			else if(num<=num2) {
				middle=num2;
			}
		}
		System.out.println("중간값은 "+middle);
	}

}
