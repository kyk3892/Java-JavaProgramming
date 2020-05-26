package Actuality;

import java.util.Scanner;

public class Actuality2_12_2 {

	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		String s = sc.next();
		double n2 = sc.nextDouble();
		double a=0;
		switch(s) {
			case "+" :
				 a= n+n2;
				 break;
			case "-" :
				 a= n-n2;
				 break;
			case "*" :
				 a= n*n2;
				 break;
			case "/" :
				 if(n2==0) {
					 System.out.println("0으로 나눌 수 없습니다.");
				 }
				 else {
					 a= n/n2;
					 break; 
				 }
			default:
				System.out.println("연산자 +,-,*,/ 중에서 선택하십시오");
				return;
		}
		System.out.println(n+s+n2+"의 계산 결과는 "+a);
	}

}
