package Practice;

import java.util.Scanner;

class Player{
	String name;
	String word;
	public Player() {}
	public Player(String name) {
		this.name = name;
	}
	public String getWordFromUser() { //사용자로부터 단어 입력받기
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		return word;
	}
	public void checkSuccess(char lastChar, char firstChar) {
		if(lastChar!=firstChar) {
			System.out.println(name+"이 졌습니다.");
			System.exit(0); //코드끄기
		}
	}
}
class WordGameApp{
	public static void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까?");
		int num = sc.nextInt();
		
		Player player[] = new Player[num]; //입력받은 수만큼 배열 만들기
		for(int i=0; i<num; i++) {
			player[i] = new Player();
			System.out.print("참가자의 이름을 입력하세요>>");
			player[i].name = sc.next();  
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		String word = "아버지";
		
		for(int i=0; i<num; i++) {
			System.out.print(player[i].name+">>");
			word = player[i].getWordFromUser();
			int lastIndex = word.length()-1;
			char lastChar = word.charAt(lastIndex);
			char firstChar = word.charAt(0);
			player[i].checkSuccess(lastChar, firstChar);
		}
	}
}
public class Open_Challenge4 {
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		WordGameApp.run();
	}
}

