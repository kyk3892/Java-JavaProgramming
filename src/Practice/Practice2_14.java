package Practice;

import java.util.Scanner;

public class Practice2_14 {

	public static void main(String[] args) {
		
		System.out.print("������ �Է��ϼ���(0~100) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char grade;
		
		switch(num/10){
			case 10:
			case 9:
				grade = 'A';
				break; //break �Ȳ����ָ� ��� ������
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
				break;
		}
		System.out.println("����� ����� "+grade+"�Դϴ�.");
	}

}
