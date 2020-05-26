package Actuality;

public class Actuality3_7 {

	public static void main(String[] args) {
		System.out.print("랜덤한 정수들 : ");
		int num[] = new int [10];
		int sum=0;
		for(int i=0; i<num.length; i++) {
			int ran = (int)(Math.random()*10+1);
			num[i]=ran;
			sum+=num[i];
			System.out.print(ran+" ");
		}
		System.out.println("\n평균은 "+(double)sum/10);
	}

}
