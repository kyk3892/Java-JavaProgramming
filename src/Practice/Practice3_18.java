package Practice;

public class Practice3_18 {

	public static void main(String[] args) {
		String num[] = {"23", "12", "3.1415", "998"}; 
		int i=0;
		try{
			for(i=0; i<num.length; i++) {
				int change = Integer.parseInt(num[i]);
				System.out.println("정수로 변환된 값은 "+change);
			}
		}
		catch(NumberFormatException a){
			System.out.println(num[i]+"는 정수로 변환할 수 없습니다.");
		}
	}
}
