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
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			System.out.println("0~99");
			Scanner sc = new Scanner(System.in);
			Scanner ac = new Scanner(System.in);
			for(int i=1; ; i++) {
				System.out.print(i+">>");	
				num = sc.nextInt();
				if(num<ran){
					System.out.println("�� ����");
					min=num;
					System.out.println(num+"-"+max);
				}
				else if(num>ran) {
					System.out.println("�� ����");
					System.out.println(min+"-"+num);
					max=num;
				}
				else {
					System.out.println("�¾ҽ��ϴ�.");
					System.out.print("�ٽ��Ͻðڽ��ϱ�?(y/n)>>");
					String again = ac.nextLine();
					if(again.equals("y")) {
						break;
					}
					else {
						System.out.println("���α׷��� ����Ǿ����ϴ�.");
						System.exit(0);
					}
				}
			}
		}
		
	}
				
}
