package Actuality;

import java.util.Scanner;

public class Actuality3_14 {

	public static void main(String[] args) {
		while(true) {
			System.out.print("과목 이름>>");
			Scanner sc = new Scanner(System.in);
			String a=sc.next();
			String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
			int score[] = {95, 88, 76, 62, 55};
			int count = 1;
			if(a.equals("그만")) {
				count=0;
				break;
			}
			for(int i=0;i<5;i++) {
				if(a.equals(course[i])) {
					int num = score[i];
					System.out.println(course[i]+"의 점수는 "+score[i]);
					count=0;
				}	
			}
			if(count==1) {
				System.out.println("없는 과목입니다.");
				
			}
		}
		

	}

}
