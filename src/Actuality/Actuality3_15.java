package Actuality;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actuality3_15 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			Scanner sc = new Scanner(System.in);
			try {
				int n=sc.nextInt();
				int m=sc.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException a){
				sc.nextLine();
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			}	
		}
	}

}
