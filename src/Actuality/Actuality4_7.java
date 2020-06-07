package Actuality;

import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) { this.work = work;}
	public String get() { return work;}
	public void show() {
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}
public class Actuality4_7 {
	static private Scanner sc;
	private static Day days[];
	int x;
	public Actuality4_7(int x) {
		this.x = x;
		days = new Day[x];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	public static void run() {
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			}
		}
	}
	public static void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	public static void view() {
		System.out.print("날짜(1~30)? >>");
		int i = sc.nextInt();
		System.out.println(i+"일의 할 일은 ");
		days[i-1].show();
	}
	public static void input() {
		System.out.print("날짜(1~30)? >>");
		int day = sc.nextInt();
		System.out.print("할일(빈칸없이입력)? >>");
		String work = sc.next();
		days[day-1].set(work);
	}
	public static void main(String[] args) {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		Actuality4_7 six = new Actuality4_7(30); //6월달의 할 일
		six.run();

	}

}
