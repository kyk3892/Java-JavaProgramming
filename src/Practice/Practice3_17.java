package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice3_17 {

	public static void main(String[] args) {
		System.out.println("���� 3���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int i,num,sum=0;
		for(i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				num = sc.nextInt();	
			}
			catch(InputMismatchException a){
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.nextLine();
				i--;
				continue;
			}
			sum += num;
		}
		System.out.println("���� "+sum);
	}

}
