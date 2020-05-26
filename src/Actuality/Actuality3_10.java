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
		while(count<6) { //6개의 0을 만들거
			int dom = (int)(Math.random()*4); //1~4줄 전부다 0이 나오게
			int dom2 = (int)(Math.random()*4); //1~4줄 전부다 0이 나오게
			if(array[dom][dom2]!=0) { //모두 다 0으로 나오게 바꾸는거
				array[dom][dom2]=0;
				count++;	//0 6개 넣으면 나오게 ++
			}
		}
		for(int i=0; i<array.length; i++) { //출력하려고
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
