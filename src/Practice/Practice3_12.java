package Practice;

public class Practice3_12 {

	public static void main(String[] args) {
		int array[] = makearray();
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

	static int[] makearray() {
		int temp[] = new int [4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}

}
