package Practice;

public class Practice3_9 {
	
	enum row {��, ��, ��, �䳢, ��, ��, ��, ��, ������, ��, ��, ����};

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5};
		String name[] = {"������","����","«��","������","���"};
		
		int sum =0;
		
		for(int num : n) {
			System.out.print(num+" ");
			sum +=num;
		}
		System.out.print("���� "+sum);
		System.out.println();
		for(String food :name) {
			System.out.print(food+" ");
		}
		System.out.println();
		for(row bon : row.values()) {
			System.out.print(bon+"�� ");
		}
	}

}
