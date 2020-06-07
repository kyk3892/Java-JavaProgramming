package Actuality;

import java.util.Scanner;

class Add{
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a+b;
	}
}
class Sub{
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a-b;
	}
}
class Mul{
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a*b;
	}
}
class Div{
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a/b;
	}
}
public class Actuality4_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		String cal = sc.next();
		
		switch(cal) {
		case "+": //객체 생성 잊지말기
			Add add = new Add();
			add.setValue(num,num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(num, num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(num, num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(num, num2);
			System.out.println(div.calculate());
			break;
		}
	}
}
