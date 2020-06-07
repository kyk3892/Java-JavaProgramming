package Actuality;

import java.util.Scanner;

class Phone{
	String name;
	String tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}
public class Actuality4_8 {
	static Phone list[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = sc.nextInt();
		list = new Phone[num];
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			list[i] = new Phone(name,tel);
		}
		System.out.println("저장되었습니다.");
		while(true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			String tel = search(name);
			if(name.equals("그만")){
				break;
			}
			if(tel==null) {
				System.out.println(name+" 이 없습니다.");
			}
			else {
				System.out.println(name+"의 번호는 "+tel+" 입니다.");
			}
		}
	}
	public static String search(String name) {
		String tel = null;
		for(int i=0; i<list.length; i++) {
			if(name.equals(list[i].name)) {
				return list[i].tel;
			}
		}
		return tel;
	}

}
