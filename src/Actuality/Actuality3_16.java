package Actuality;

import java.util.Scanner;

public class Actuality3_16 {

	public static void main(String[] args) {
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			Scanner sc = new Scanner(System.in);
			String game = sc.next();
			String str[] = {"����","����","��"};
			int ran=(int)(Math.random()*3);
			
			if(str[ran].equals("����")) {
				if(game.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(game.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				else if(game.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			
			if(str[ran].equals("����")) {
				if(game.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(game.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(game.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
			}
			
			if(str[ran].equals("��")) {
				if(game.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				}
				else if(game.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(game.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
				}
			}
			
			if(game.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
		
		}

	}

}
