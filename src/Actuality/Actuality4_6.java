package Actuality;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 ("+x+","+y+")"+radius);
	}
}
public class Actuality4_6 {

	public static void main(String[] args) {
		double max =0;
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		for(int i=0; i<c.length; i++) {
			if(max<=c[i].getArea()) {
				max = c[i].getArea();
			}
		}
		for(int i=0; i<c.length; i++) {
			if(max==c[i].getArea()) {
				c[i].show();
			}
		}
		sc.close();

	}

}
