package Actuality;

public class Actuality3_9 {

	public static void main(String[] args) {
		int num [][] = new int[4][4];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				int ran = (int)(Math.random()*10+1);
				num[i][j]=ran;
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
