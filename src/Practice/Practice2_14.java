package Practice;

import java.util.Scanner;

public class Practice2_14 {

	public static void main(String[] args) {
		
		System.out.print("점수를 입력하세요(0~100) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char grade;
		
		switch(num/10){
			case 10:
			case 9:
				grade = 'A';
				break; //break 안끊어주면 계속 진행함
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
		System.out.println("당신의 등급은 "+grade+"입니다.");
	}

}
