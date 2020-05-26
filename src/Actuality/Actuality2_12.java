package Actuality;

import java.util.Scanner;

public class Actuality2_12 {

	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		String s = sc.next();
		double n2 = sc.nextDouble();
		if(s.equals("+")) {
			double sum = n+n2;
			System.out.println(n+s+n2+"의 계산 결과는 "+sum);
		}
		else if(s.equals("+")) {
			double sum = n+n2;
			System.out.println(n+s+n2+"의 계산 결과는 "+sum);
		}
		else if(s.equals("-")) {
			double m = n-n2;
			System.out.println(n+s+n2+"의 계산 결과는 "+m);
		}
		else if(s.equals("*")) {
			double p = n*n2;
			System.out.println(n+s+n2+"의 계산 결과는 "+p);
		}
		else if(s.equals("/")) {
			if(n2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				double h = n/n2;
				System.out.println(n+s+n2+"의 계산 결과는 "+h);	
			}
			
		}
		else {
			System.out.println("연산자는 +,-,*,/ 중에서 선택해주십시오");
		}

	}

}
