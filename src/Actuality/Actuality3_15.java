package Actuality;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actuality3_15 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			Scanner sc = new Scanner(System.in);
			try {
				int n=sc.nextInt();
				int m=sc.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException a){
				sc.nextLine();
				System.out.println("실수는 입력하면 안됩니다.");
			}	
		}
	}

}
