package Practice;

public class Practice3_9 {
	
	enum row {Áã, ¼Ò, ¹ü, Åä³¢, ¿ë, ¹ì, ¸», ¾ç, ¿ø¼şÀÌ, ´ß, °³, µÅÁö};

	public static void main(String[] args) {
		int n[] = {1,2,3,4,5};
		String name[] = {"¶±ººÀÌ","ÇÇÀÚ","Â«»Í","¸¶¶óÅÁ","¶ó¸é"};
		
		int sum =0;
		
		for(int num : n) {
			System.out.print(num+" ");
			sum +=num;
		}
		System.out.print("ÇÕÀº "+sum);
		System.out.println();
		for(String food :name) {
			System.out.print(food+" ");
		}
		System.out.println();
		for(row bon : row.values()) {
			System.out.print(bon+"¶ì ");
		}
	}

}
