package Actuality;

public class Actuality3_10 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int count=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				int ran=(int)(Math.random()*10+1);
				array[i][j]=ran;
			}
		}
		while(count<6) { //6���� 0�� �����
			int dom = (int)(Math.random()*4); //1~4�� ���δ� 0�� ������
			int dom2 = (int)(Math.random()*4); //1~4�� ���δ� 0�� ������
			if(array[dom][dom2]!=0) { //��� �� 0���� ������ �ٲٴ°�
				array[dom][dom2]=0;
				count++;	//0 6�� ������ ������ ++
			}
		}
		for(int i=0; i<array.length; i++) { //����Ϸ���
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
