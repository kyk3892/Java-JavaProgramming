package Practice;

import java.util.Scanner;

public class Open_Challenge2 {

	public static void main(String[] args) {
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.print("���� >> ");
		String b = sc.nextLine();
		if(a.equals("����")){
			if(b.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if(b.equals("����")){
				System.out.println("���� �̰���ϴ�.");
			}
			else if(b.equals("��")){
				System.out.println("ö���� �̰���ϴ�.");
			}
		}
		else if(a.equals("����")){
			if(b.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(b.equals("����")){
				System.out.println("�����ϴ�.");
			}
			else if(b.equals("��")){
				System.out.println("���� �̰���ϴ�.");
			}
		}
		else if(a.equals("��")){
			if(b.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if(b.equals("����")){
				System.out.println("ö���� �̰���ϴ�.");
			}
			else if(b.equals("��")){
				System.out.println("�����ϴ�.");
			}
		}
		else {
			System.out.println("����, ����, �� �� �ϳ��� �Է����ֽʽÿ�.");
		}
	}

}
