package Actuality;

import java.util.Scanner;

public class Actuality2_12 {

	public static void main(String[] args) {
		System.out.print("����>>");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		String s = sc.next();
		double n2 = sc.nextDouble();
		if(s.equals("+")) {
			double sum = n+n2;
			System.out.println(n+s+n2+"�� ��� ����� "+sum);
		}
		else if(s.equals("+")) {
			double sum = n+n2;
			System.out.println(n+s+n2+"�� ��� ����� "+sum);
		}
		else if(s.equals("-")) {
			double m = n-n2;
			System.out.println(n+s+n2+"�� ��� ����� "+m);
		}
		else if(s.equals("*")) {
			double p = n*n2;
			System.out.println(n+s+n2+"�� ��� ����� "+p);
		}
		else if(s.equals("/")) {
			if(n2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else {
				double h = n/n2;
				System.out.println(n+s+n2+"�� ��� ����� "+h);	
			}
			
		}
		else {
			System.out.println("�����ڴ� +,-,*,/ �߿��� �������ֽʽÿ�");
		}

	}

}
