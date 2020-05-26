package Practice;

import java.util.Random;

import java.util.Scanner;

public class Open_Challenge3 {

	public static void main(String[] args) {
		
		while(true){
			int ran = (int)(Math.random()*100);
			int num;
			int min =0;
			int max =99;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("0~99");
			Scanner sc = new Scanner(System.in);
			Scanner ac = new Scanner(System.in);
			for(int i=1; ; i++) {
				System.out.print(i+">>");	
				num = sc.nextInt();
				if(num<ran){
					System.out.println("더 높게");
					min=num;
					System.out.println(num+"-"+max);
				}
				else if(num>ran) {
					System.out.println("더 낮게");
					System.out.println(min+"-"+num);
					max=num;
				}
				else {
					System.out.println("맞았습니다.");
					System.out.print("다시하시겠습니까?(y/n)>>");
					String again = ac.nextLine();
					if(again.equals("y")) {
						break;
					}
					else {
						System.out.println("프로그램이 종료되었습니다.");
						System.exit(0);
					}
				}
			}
		}
		
	}
				
}
