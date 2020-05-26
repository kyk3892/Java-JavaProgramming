package Practice;

public class Practice3_9 {
	
	enum row {쥐, 소, 범, 토끼, 용, 뱀, 말, 양, 원숭이, 닭, 개, 돼지};

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5};
		String name[] = {"떡볶이","피자","짬뽕","마라탕","라면"};
		
		int sum =0;
		
		for(int num : n) {
			System.out.print(num+" ");
			sum +=num;
		}
		System.out.print("합은 "+sum);
		System.out.println();
		for(String food :name) {
			System.out.print(food+" ");
		}
		System.out.println();
		for(row bon : row.values()) {
			System.out.print(bon+"띠 ");
		}
	}

}
