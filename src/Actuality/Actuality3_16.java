package Actuality;

import java.util.Scanner;

public class Actuality3_16 {

	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			Scanner sc = new Scanner(System.in);
			String game = sc.next();
			String str[] = {"가위","바위","보"};
			int ran=(int)(Math.random()*3);
			
			if(str[ran].equals("가위")) {
				if(game.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				}
				else if(game.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				}
				else if(game.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
				}
			}
			
			if(str[ran].equals("바위")) {
				if(game.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
				}
				else if(game.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				}
				else if(game.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
				}
			}
			
			if(str[ran].equals("보")) {
				if(game.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				}
				else if(game.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
				}
				else if(game.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
				}
			}
			
			if(game.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
		
		}

	}

}
