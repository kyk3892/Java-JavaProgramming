package Actuality;

import java.util.Scanner;

public class Actuality2_8 {

	public static void main(String[] args) {
		System.out.print("�� �� (x1,y1), (x2,y2)�� �Է��Ͻÿ�>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
