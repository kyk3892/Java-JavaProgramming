package Actuality;

import java.util.Scanner;

public class Actuality2_3 {

	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int fiveman = (int)money/50000;
		int man = (int)money%50000/10000;
		int thousand = (int)money%10000/1000;
		int fivehd = (int)money%1000/500;
		int onehd = (int)money%500/100;
		int fitten = (int)money%100/50;
		int ten = (int)money%50/10;
		int one = (int)money%10/1;
		
		System.out.println("�������� "+fiveman+"��");
		System.out.println("������ "+man+"��");
		System.out.println("õ���� "+thousand+"��");
		System.out.println("����� "+fivehd+"��");
		System.out.println("��� "+onehd+"��");
		System.out.println("���ʿ� "+fitten+"��");
		System.out.println("�ʿ� "+ten+"��");
		System.out.println("�Ͽ� "+one+"��");

	}

}
