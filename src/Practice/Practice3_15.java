package Practice;

import java.util.Scanner;

public class Practice3_15 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("�������� �Է��Ͻÿ� : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.print("�������� �Է��Ͻÿ� : ");
			int num2 = sc.nextInt();
			try {
				int result = num/num2;
				System.out.println(num+"��(��) "+num2+"�� ������ ���� "+result+"�Դϴ�.");
				break;
			}
			catch(ArithmeticException a){
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}	
		}
	}

}
