package Practice;

import java.util.Scanner;

public class Practice3_15 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("나뉨수를 입력하시오 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.print("나눗수를 입력하시오 : ");
			int num2 = sc.nextInt();
			try {
				int result = num/num2;
				System.out.println(num+"를(을) "+num2+"로 나누면 몫은 "+result+"입니다.");
				break;
			}
			catch(ArithmeticException a){
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}	
		}
	}

}
