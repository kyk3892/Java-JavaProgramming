package Practice;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}
public class Practice4_2 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 길이는?>>");
		rect.width = sc.nextInt();
		System.out.print("사각형의 높이는?>>");
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 "+rect.getArea());
	}
}
