package Practice;

public class Practice3_16 {

	public static void main(String[] args) {
		int array[] = new int [5];
		try {
			for(int i=0; i<array.length; i++) {
				array[i+1] = i+1+array[i];
				System.out.println("array["+i+"]="+array[i]);	
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}

	}

}
